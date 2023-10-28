package figures.subclass;

public class Circle extends figures.Figure {
    private final double radius;
    private final double area;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        this.area = this.calculateArea();
    }

    // Getters
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.area;
    }

    // To String
    public String toString() {
        return super.toString()
                + "Radius: " + this.radius + "\n"
                + "Area: " + this.area + " u^2";
    }

    // Methods
    private double calculateArea() {
        double result = Math.PI * Math.pow(this.radius, 2);
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }
}
