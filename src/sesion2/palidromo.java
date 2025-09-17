package sesion2;

import java.util.Scanner;

public class palidromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("✅ La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("❌ La palabra \"" + palabra + "\" NO es un palíndromo.");
        }

        sc.close();
    }

    // Método para verificar si es palíndromo
    public static boolean esPalindromo(String texto) {
        // Pasamos a minúsculas y quitamos espacios
        texto = texto.toLowerCase().replace(" ", "");

        int i = 0;
        int j = texto.length() - 1;

        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false; // Si hay una diferencia, no es palíndromo
            }
            i++;
            j--;
        }
        return true;
    }
}

