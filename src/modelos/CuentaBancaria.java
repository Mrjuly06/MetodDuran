package modelos;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos para depositar y retirar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depositado: " + cantidad + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retirado: " + cantidad + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad inválida para retiro.");
        }
    }
}

