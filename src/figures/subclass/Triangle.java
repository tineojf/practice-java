package figures.subclass;

public class Triangle extends figures.Figure {
    private enum TriangleType {EQUILATERAL, ISOSCELES, SCALENE}

    private final double side1;
    private final double side2;
    private final double side3;
    private final TriangleType type;
    private final double area;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = this.calculateTriangleType();
        this.area = this.calculateArea();
    }

    // Getters
    public double getArea() {
        return this.area;
    }

    // To String
    public String toString() {
        return super.toString()
                + "Side 1: " + this.side1 + "\n"
                + "Side 2: " + this.side2 + "\n"
                + "Side 3: " + this.side3 + "\n"
                + "Type: " + this.type + "\n"
                + "Area: " + this.area + " u^2" + "\n";
    }


    // Methods
    private TriangleType calculateTriangleType() {
        if (this.side1 == this.side2 && this.side2 == this.side3) {
            return TriangleType.EQUILATERAL;
        } else if (this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }

    public double calculateArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }

}
