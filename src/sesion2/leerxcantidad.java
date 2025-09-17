package sesion2;
//leer x cantidad  de numeros y mostrar dicho # en orden inverso a su ingreso
import java.util.Scanner;
import java.util.Stack;

public class leerxcantidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("¿Cuántos números desea ingresar? ");
        int n = sc.nextInt();

        // Apilar los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            pila.push(numero); // Se apila el número
        }

        // Desapilar en orden inverso
        System.out.println("\nNúmeros en orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        sc.close();
    }
}
