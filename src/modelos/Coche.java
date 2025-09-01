package modelos;

public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}