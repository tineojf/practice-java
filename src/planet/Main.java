package planet;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12756, 150000000, Planet.PlanetType.TERRESTRIAL, true);

        System.out.println(earth);
        System.out.println("--------------------");
        System.out.println(earth.density());
        System.out.println("--------------------");
        System.out.println(earth.inExteriorZone());
        System.out.println("--------------------");

        Planet p2 = new Planet("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, Planet.PlanetType.GASEOUS, true);

        System.out.println(p2);
        System.out.println("--------------------");
        System.out.println(p2.density());
        System.out.println("--------------------");
        System.out.println(p2.inExteriorZone());
        System.out.println("--------------------");
    }
}
