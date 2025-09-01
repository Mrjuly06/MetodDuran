package modelos;

public class estudiante {
    // Atributos
    private String nombre;
    private String matricula;
    private double promedio;

    // Constructor
    public estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Método para verificar si aprobó
    public void verificarAprobacion() {
        if (promedio >= 70) {
            System.out.println(nombre + " ha aprobado.");
        } else {
            System.out.println(nombre + " no ha aprobado.");
        }
    }
}
