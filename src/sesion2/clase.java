package sesion2;

public class clase {public class Descuento {

    public static double aplicarDescuento(double montoCompra) {
        double descuento = 0.0;

        if (montoCompra >= 200) {
            descuento = montoCompra * 0.10;  // 10% de descuento
        }

        double total = montoCompra - descuento;
        return total;
    }

    public static void main(String[] args) {
        double compra1 = 150;  // No aplica descuento
        double compra2 = 250;  // Aplica descuento

        System.out.println("Compra de C$" + compra1 + " -> Total para pagar: C$" + aplicarDescuento(compra1));
        System.out.println("Compra de C$" + compra2 + " -> Total para pagar: C$" + aplicarDescuento(compra2));
    }
}

}
