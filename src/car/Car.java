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
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    // To String
    @Override
    public String toString() {
        return "Car: \n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Motor: " + motor + "\n" +
                "Tipo de combustible: " + tipoCombustible + "\n" +
                "Tipo de automovil: " + tipoAutomovil + "\n" +
                "Puertas: " + puertas + "\n" +
                "Asientos: " + asientos + "\n" +
                "Velocidad máxima: " + maxVelocidad + "\n" +
                "Color: " + color + "\n" +
                "Velocidad actual: " + velocidad;
    }

    // Methods
    public void acelerar(double aceleracion) {
        if (aceleracion > 0 && this.velocidad + aceleracion <= this.maxVelocidad) {
            this.velocidad += aceleracion;
        } else {
            System.out.println("La aceleración debe ser mayor a 0 y la velocidad no debe superar la máxima");
        }
    }

    public void desacelerar(double desaceleracion) {
        if (desaceleracion > 0 && this.velocidad - desaceleracion >= 0) {
            this.velocidad -= desaceleracion;
        } else {
            System.out.println("La desaceleración debe ser mayor a 0");
        }
    }

    public void frenar() {
        this.velocidad = 0;
    }

    public void calcularTiempo(double distancia) {
        if (this.velocidad > 0 && distancia > 0) {
            System.out.println("El tiempo es: " + distancia / this.velocidad);
        } else {
            System.out.println("El auto está detenido");
        }
    }
}
