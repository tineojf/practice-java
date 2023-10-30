package figures.subclass;

public class Square extends figures.subclass.Parallelogram {
    private final double side;

    // Constructor
    public Square(double side) {
        super("Square", side, side);
        this.side = side;
    }

    // To String
    public String toString() {
        return super.toString()
                + "Side: " + this.side;
    }
}
