package sistemagestion;

public class Arbitro {
    private String nombre;
    private String licencia;

    public Arbitro(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }
}
