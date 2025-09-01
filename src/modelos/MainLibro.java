package modelos;

public class MainLibro {
    public static void main(String[] args) {
        Libro miLibro = new Libro("1984", "George Orwell", 328);
        System.out.println(miLibro.obtenerDescripcion());
}
}