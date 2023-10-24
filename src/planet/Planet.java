package planet;

public class Planet {
    enum PlanetType {TERRESTRIAL, GASEOUS, DWARF}

    private String name = null;
    private int satellites = 0;
    private double mass = 0.0;
    private double volume = 0.0;
    private int diameter = 0;
    private int distanceFromSun = 0;
    private PlanetType type;
    private boolean observable = false;

    // Constructor
    public Planet(String name, int satellites,
                  double mass, double volume,
                  int diameter, int distanceFromSun,
                  PlanetType type, boolean observable) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.type = type;
        this.observable = observable;
    }

    // To String
    public String toString() {
        return "Planet: " + name + "\n" +
                "Satellites: " + satellites + "\n" +
                "Mass: " + mass + "\n" +
                "Volume: " + volume + "\n" +
                "Diameter: " + diameter + "\n" +
                "Distance from Sun: " + distanceFromSun + "\n" +
                "Type: " + type + "\n" +
                "Observable: " + observable + "\n";
    }

    // Methods
    public double density() {
        return this.mass / this.volume;
    }

    public double kmToUA(double _distance) {
        return _distance / 149597870.0;
    }

    public boolean inExteriorZone() {
        double distanceInUA = this.kmToUA(this.distanceFromSun);
        return distanceInUA >= 3.4;
    }
}
