package car;

public class Car {
    enum typeCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL}

    enum typeAutomovil {CARROCIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}

    enum color {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}

    private String marca;
    private int modelo;
    private double motor;
    private typeCombustible tipoCombustible;
    private typeAutomovil tipoAutomovil;
    private int puertas;
    private int asientos;
    private double maxVelocidad;
    private color color;
    private double velocidad;

    // Constructor
    public Car(String marca, int modelo, double motor,
               typeCombustible tipoCombustible, typeAutomovil tipoAutomovil,
               int puertas, int asientos, double maxVelocidad, color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.puertas = puertas;
        this.asientos = asientos;
        this.maxVelocidad = maxVelocidad;
        this.color = color;
        this.velocidad = 0;
    }

    // Setters & Getters

}
