package figures;

public class Figure {
    protected String name;

    public Figure(String _name) {
        this.name = _name;
    }

    // To String
    @Override
    public String toString() {
        return "Name: " + this.name + "\n";
    }
}
