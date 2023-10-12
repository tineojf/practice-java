package cilindro;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        System.out.println("Cylinder calculator");
        double radius = inData("radius");
        double height = inData("height");

        if (radius == -1 || height == -1) {
            System.out.println("Error: invalid value, try again");
        } else {
            System.out.println("Area: " + area(radius, height) + " u^2");
            System.out.println("Volume: " + volume(radius, height) + " u^3");
        }
    }

    public static double area(double _radius, double _height) {
        double result = 2 * Math.PI * _radius * (_radius + _height);
        return redound(result);
    }

    public static double volume(double _radius, double _height) {
        double result = Math.PI * Math.pow(_radius, 2) * _height;
        return redound(result);
    }

    public static double redound(double _value) {
        return Math.round(_value * 100.0) / 100.0;
    }

    public static double inData(String _message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of " + _message + ": ");
        double value = scanner.nextDouble();

        if (value <= 0.0) {
            return -1;
        } else {
            return value;
        }
    }
}
