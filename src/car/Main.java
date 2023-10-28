package car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", 2019, 2.0, Car.typeCombustible.GASOLINA,
                Car.typeAutomovil.SUV, 4, 5, 200, Car.color.AZUL);

        car1.setVelocidad(100);
        System.out.println(car1.getVelocidad());
        System.out.println("--------------------");

        car1.acelerar(20);
        System.out.println(car1.getVelocidad());
        System.out.println("--------------------");

        car1.desacelerar(50);
        System.out.println(car1.getVelocidad());
        System.out.println("--------------------");

        car1.frenar();
        System.out.println(car1.getVelocidad());
        System.out.println("--------------------");

        System.out.println(car1);
        System.out.println("--------------------");
    }
}
