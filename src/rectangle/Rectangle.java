package rectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double width, height;
        width = inData("width");
        height = inData("height");

        if (width == -1 || height == -1) {
            System.out.println("Error: invalid value, try again");
        } else {
            System.out.println("Area: " + area(width, height) + " u^2");
            System.out.println("Perimeter: " + perimeter(width, height) + " u");
        }
    }

    public static double inData(String _value) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the value of " + _value);
        double value = scan.nextDouble();

        if (value <= 0) {
            return -1;
        } else {
            return value;
        }
    }

    public static double perimeter(double _width, double _height) {
        return 2 * (_width) + 2 * (_height);
    }

    public static double area(double _width, double _height) {
        return _width * _height;
    }

    public static double redound(double _value) {
        return Math.round(_value * 100.0) / 100.0;
    }
}
