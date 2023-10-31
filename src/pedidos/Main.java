package pedidos;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sopa", 10000, "Coca-Cola", 3000);
        System.out.println();

        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Sopa", 10000, "Pollo", 20000, "Coca-Cola", 3000);
        System.out.println();

        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Sopa", 10000, "Pollo", 20000, "Coca-Cola", 3000, "Helado", 5000);
        System.out.println();
    }
}
