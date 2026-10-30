import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SistemaReservas s = new SistemaReservas();
        Funcion f = new Funcion("Interestelar", 3, "20:30", 12.0);

        Cliente anaCliente = new Cliente("Ana", "ana@mail.com", true);
        int r1 = s.crearReservacion(anaCliente, f,
                Arrays.asList(new Asiento('F', 5), new Asiento('F', 6)), "App");
        System.out.println("Reserva Ana: " + r1);

        Cliente luisCliente = new Cliente("Luis", "luis@mail.com", false);
        int r2;
        try {
            r2 = s.crearReservacion(luisCliente, f,
                    Arrays.asList(new Asiento('F', 7), new Asiento('F', 6)), "Taquilla");
        } catch (IllegalStateException e) {
            r2 = -3;
        }
        System.out.println("Reserva Luis: " + r2);
        System.out.println("Ocupados: " + f.getOcupados());

        Reserva ana = s.buscar(1);
        System.out.println("Precio Ana (socio): " + ana.precio);

        System.out.println("Cancelar 1: " + cancelarConCodigo(s, 1));
        System.out.println("Cancelar 99: " + cancelarConCodigo(s, 99));
    }

    // TECNICA UTILIZADA: REPLACE EXCEPTION WITH TEST.
    // REFACTOR: La excepción se transforma en el código visible requerido por la salida.
    private static int cancelarConCodigo(SistemaReservas sistema, int id) {
        try {
            sistema.cancelar(id);
            return 0;
        } catch (IllegalArgumentException e) {
            return -1;
        } catch (IllegalStateException e) {
            return -2;
        }
    }
}
