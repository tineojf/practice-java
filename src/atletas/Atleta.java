package atletas;

public class Atleta {
    private static int contador = 0;
    private static String seleccion = "Tierra";
    private static double timeTeam = 0.0;

    private int id;
    private String name;
    private double timeAlone;

    // Constructor
    public Atleta(String name, double timeAlone) {
        contador++;
        this.id = contador;
        this.name = name;
        this.timeAlone = timeAlone;
    }

    // Getters
    public static double getTimeTeam() {
        return timeTeam;
    }

    public static String getSeleccion() {
        return seleccion;
    }

    // To String
    @Override
    public String toString() {
        return "Id: " + this.id + " - Atleta: " + this.name + " - Tiempo: " + this.timeAlone;
    }

    // Methods
    public void correr400m() {
        timeTeam += this.timeAlone;
    }
}
