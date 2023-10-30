package figures.subclass;

public class Square extends figures.subclass.Parallelogram {
    // Constructor
    public Square(double side) {
        super("Square", side, side);
    }

    // To String
    public String toString() {
        return super.toString()
                + "Side: " + super.getBase();
    }
}
