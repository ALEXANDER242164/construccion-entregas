import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Funcion {
    public String titulo;
    public int sala;
    public String hora;
    public double precio;
    private final List<String> ocupados = new ArrayList<>();

    public Funcion(String titulo, int sala, String hora, double precio) {
        this.titulo = titulo;
        this.sala = sala;
        this.hora = hora;
        this.precio = precio;
    }

    // TECNICA UTILIZADA: SEPARATE QUERY FROM MODIFIER.
    // REFACTOR: La consulta de disponibilidad se separa de la modificación del estado.
    public boolean estaOcupado(Asiento asiento) {
        return ocupados.contains(asiento.codigo());
    }

    public void ocupar(Asiento asiento) {
        String codigo = asiento.codigo();
        if (estaOcupado(asiento)) {
            throw new IllegalStateException("Asiento ocupado: " + codigo);
        }
        ocupados.add(codigo);
    }

    // TECNICA UTILIZADA: HIDE METHOD.
    // REFACTOR: Se expone una vista de solo lectura en lugar de la lista interna.
    public List<String> getOcupados() {
        return Collections.unmodifiableList(ocupados);
    }

    public void liberar(String codigo) {
        ocupados.remove(codigo);
    }
}
