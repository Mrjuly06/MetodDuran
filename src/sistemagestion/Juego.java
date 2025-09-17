package sistemagestion;

public class Juego {
    private String nombre;
    private Categoria categoria;

    public Juego(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
