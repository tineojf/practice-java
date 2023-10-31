package conversormetros;

public class ConversorMetros {
    private final double metros;
    private final int decimales;
    private final double CENTIMETROS = 100;
    private final double MILIMETROS = 1000;
    private final double PULGADAS = 39.3701;
    private final double PIES = 3.28084;
    private final double YARDAS = 1.09361;

    // Constructor
    public ConversorMetros(double metros, int decimales) {
        this.metros = metros;
        this.decimales = decimales;
    }

    // Getters
    public double getMetros() {
        return metros;
    }

    // To String
    @Override
    public String toString() {
        return "Metros: " + this.metros + "\n"
                + "Centimetros: " + this.toCM() + "\n"
                + "Milimetros: " + this.toMM() + "\n"
                + "Pulgadas: " + this.toPULG() + "\n"
                + "Pies: " + this.toPIES() + "\n"
                + "Yardas: " + this.toYARDAS() + "\n";
    }

    // Methods
    private double redondear(double numero, int decimales) {
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }

    public double toCM() {
        return this.redondear(this.metros * this.CENTIMETROS, this.decimales);
    }

    public double toMM() {
        return this.redondear(this.metros * this.MILIMETROS, this.decimales);
    }

    public double toPULG() {
        return this.redondear(this.metros * this.PULGADAS, this.decimales);
    }

    public double toPIES() {
        return this.redondear(this.metros * this.PIES, this.decimales);
    }

    public double toYARDAS() {
        return this.redondear(this.metros * this.YARDAS, this.decimales);
    }
}
