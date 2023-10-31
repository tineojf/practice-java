package pedidos;

public class Pedido {
    private String primero;
    private String segundo;
    private String postre;
    private String bebida;
    private double primeroCosto;
    private double segundoCosto;
    private double postreCosto;
    private double bebidaCosto;
    private double total;

    // Constructor
    public Pedido() {
        this.primeroCosto = 0;
        this.segundoCosto = 0;
        this.postreCosto = 0;
        this.bebidaCosto = 0;
        this.total = this.primeroCosto + this.segundoCosto + this.postreCosto + this.bebidaCosto;
    }

    // Getters & Setters

    // Methods
    public void calcularPedido(String primero, double primeroCosto,
                               String bebida, double bebidaCosto) {
        this.primero = primero;
        this.primeroCosto = primeroCosto;
        this.bebida = bebida;
        this.bebidaCosto = bebidaCosto;
        System.out.println("Usted pidio " + this.primero + " que cuesta " + this.primeroCosto);
        System.out.println("Usted pidio " + this.bebida + " que cuesta " + this.bebidaCosto);
        System.out.println("El total de su pedido es " + this.primeroCosto);
    }

    public void calcularPedido(String primero, double primeroCosto,
                               String segundo, double segundoCosto,
                               String bebida, double bebidaCosto) {
        this.primero = primero;
        this.primeroCosto = primeroCosto;
        this.segundo = segundo;
        this.segundoCosto = segundoCosto;
        this.bebida = bebida;
        this.bebidaCosto = bebidaCosto;
        System.out.println("Usted pidio " + this.primero + " que cuesta " + this.primeroCosto);
        System.out.println("Usted pidio " + this.segundo + " que cuesta " + this.segundoCosto);
        System.out.println("Usted pidio " + this.bebida + " que cuesta " + this.bebidaCosto);
        System.out.println("El total de su pedido es " + (this.primeroCosto + this.segundoCosto));
    }

    public void calcularPedido(String primero, double primeroCosto,
                               String segundo, double segundoCosto,
                               String bebida, double bebidaCosto,
                               String postre, double postreCosto) {
        this.primero = primero;
        this.primeroCosto = primeroCosto;
        this.segundo = segundo;
        this.segundoCosto = segundoCosto;
        this.bebida = bebida;
        this.bebidaCosto = bebidaCosto;
        this.postre = postre;
        this.postreCosto = postreCosto;
        System.out.println("Usted pidio " + this.primero + " que cuesta " + this.primeroCosto);
        System.out.println("Usted pidio " + this.segundo + " que cuesta " + this.segundoCosto);
        System.out.println("Usted pidio " + this.bebida + " que cuesta " + this.bebidaCosto);
        System.out.println("Usted pidio " + this.postre + " que cuesta " + this.postreCosto);
        System.out.println("El total de su pedido es " + (this.primeroCosto + this.segundoCosto + this.postreCosto));
    }
}
