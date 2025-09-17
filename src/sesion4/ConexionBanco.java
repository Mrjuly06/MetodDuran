package sesion4;

// Clase Singleton: Simula la conexión al banco
public class ConexionBanco {
    // Variable estática para guardar la única instancia
    private static ConexionBanco instancia;

    // Constructor privado: evita que otros creen objetos
    private ConexionBanco() {
        System.out.println("Conectado al servidor central del banco.");
    }

    // Método estático que devuelve siempre la misma instancia
    public static ConexionBanco getInstance() {
        if (instancia == null) {
            instancia = new ConexionBanco();
        }
        return instancia;
    }

    // Método de ejemplo
    public void realizarOperacion(String operacion) {
        System.out.println("Realizando operación: " + operacion);
    }
}

