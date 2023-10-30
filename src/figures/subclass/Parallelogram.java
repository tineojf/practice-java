package figures.subclass;

public class Parallelogram extends figures.Figure {

    private final double base;
    private final double height;
    private final double area;
    private final double hypothenuse;

    // Constructor
    public Parallelogram(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
        this.area = this.calculateArea();
        this.hypothenuse = this.calculateHypothenuse();
    }

    // Getters
    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    // To String
    public String toString() {
        return super.toString()
                + "Hypothenuse: " + this.hypothenuse + "\n"
                + "Area: " + this.area + " u^2" + "\n";
    }

    // Methods
    public double calculateArea() {
        double result = this.base * this.height;
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }

    public double calculateHypothenuse() {
        double result = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.height, 2));
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }
}
