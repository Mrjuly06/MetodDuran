package modelos;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(1500); // Caso inválido
    }
}
