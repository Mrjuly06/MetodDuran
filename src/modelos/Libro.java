package modelos;

public class Libro {// Atributos
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para obtener descripción del libro
    public String obtenerDescripcion() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nNúmero de páginas: " + numPaginas;
}

}
