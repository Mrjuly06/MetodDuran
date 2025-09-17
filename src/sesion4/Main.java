package sesion4;

// Clase principal: Simula los cajeros
public class Main {
    public static void main(String[] args) {
        // Cajero 1 accede a la conexión
        ConexionBanco cajero1 = ConexionBanco.getInstance();
        cajero1.realizarOperacion("Retiro de 100 dólares");

        // Cajero 2 accede a la misma conexión
        ConexionBanco cajero2 = ConexionBanco.getInstance();
        cajero2.realizarOperacion("Consulta de saldo");

        // Verificar que es la misma instancia
        if (cajero1 == cajero2) {
            System.out.println("Todos los cajeros usan la misma conexión (Singleton).");
        }
    }
}
