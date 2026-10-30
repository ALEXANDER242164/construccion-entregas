import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaReservas {
    private final Map<Integer, Object> db = new HashMap<>();
    public int contador = 1;

    // TECNICA UTILIZADA: RENAME METHOD, REMOVE PARAMETER, PRESERVE WHOLE OBJECT,
    // INTRODUCE PARAMETER OBJECT Y ADD PARAMETER.
    // REFACTOR: El método tiene un nombre claro, recibe Cliente y Asiento, y conserva canal.
    public int crearReservacion(Cliente cliente, Funcion funcion, List<Asiento> asientos,
            String canal) {
        if (cliente == null || funcion == null) {
            throw new IllegalArgumentException("Cliente y función son obligatorios");
        }
        if (asientos == null || asientos.isEmpty()) {
            throw new IllegalArgumentException("Debe indicar al menos un asiento");
        }
        List<String> lista = new java.util.ArrayList<>();
        for (Asiento asiento : asientos) {
            if (funcion.estaOcupado(asiento)) {
                throw new IllegalStateException("Asiento ocupado: " + asiento.codigo());
            }
            funcion.ocupar(asiento);
            lista.add(asiento.codigo());
        }
        Reserva reserva = new Reserva(contador, cliente, funcion, lista, canal);
        reserva.precio = cliente.socio
                ? calcularPrecioSocio(reserva)
                : calcularPrecioGeneral(reserva);
        db.put(contador, reserva);
        contador++;
        return reserva.id;
    }

    // TECNICA UTILIZADA: REPLACE PARAMETER WITH METHOD Y REPLACE PARAMETER
    // WITH EXPLICIT METHOD.
    // REFACTOR: El precio base se obtiene de la función y la tarifa usa métodos explícitos.
    public double calcularPrecioGeneral(Reserva reserva) {
        return precioBase(reserva);
    }

    public double calcularPrecioSocio(Reserva reserva) {
        return aplicarDescuento(precioBase(reserva), 0.15);
    }

    private double precioBase(Reserva reserva) {
        return reserva.funcion.precio * reserva.asientos.size();
    }

    // TECNICA UTILIZADA: PARAMETERIZE METHOD.
    // REFACTOR: Un único método aplica cualquier porcentaje de descuento.
    private double aplicarDescuento(double precio, double porcentaje) {
        return precio - precio * porcentaje;
    }

    // TECNICA UTILIZADA: ENCAPSULATE DOWNCAST Y REPLACE ERROR CODE
    // WITH EXCEPTION.
    // REFACTOR: La conversión queda centralizada y los errores se expresan como excepciones.
    public void cancelar(int id) {
        Reserva reserva = obtenerReserva(id);
        if (reserva.cancelada) {
            throw new IllegalStateException("La reserva ya está cancelada");
        }
        for (String asiento : reserva.asientos) {
            reserva.funcion.liberar(asiento);
        }
        reserva.cancelar();
    }

    private Reserva obtenerReserva(int id) {
        Object reserva = db.get(id);
        if (!(reserva instanceof Reserva)) {
            throw new IllegalArgumentException("Reserva inexistente: " + id);
        }
        return (Reserva) reserva;
    }

    public Reserva buscar(int id) {
        return obtenerReserva(id);
    }
}
