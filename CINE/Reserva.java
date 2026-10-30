import java.util.List;

public class Reserva {
    public int id;
    public Cliente cliente;
    public Funcion funcion;
    public List<String> asientos;
    public double precio;
    public boolean cancelada;
    public String canal;

    public Reserva(int id, Cliente cliente, Funcion funcion, List<String> asientos, String canal) {
        this.id = id;
        this.cliente = cliente;
        this.funcion = funcion;
        this.asientos = asientos;
        this.canal = canal;
    }

    // TECNICA UTILIZADA: REMOVE SETTING METHOD.
    // REFACTOR: Se reemplaza el setter por una operación que expresa la intención.
    public void cancelar() {
        this.cancelada = true;
    }
}