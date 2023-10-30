package figures.subclass;

public class Rectangle extends figures.subclass.Parallelogram {
    // Constructor
    public Rectangle(double base, double height) {
        super("Rectangle", base, height);
    }

    // To String
    public String toString() {
        return super.toString()
                + "Base: " + super.getBase() + "\n"
                + "Height: " + super.getHeight();
    }
}
