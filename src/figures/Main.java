package figures;

import figures.subclass.Circle;
import figures.subclass.Rectangle;
import figures.subclass.Square;
import figures.subclass.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println("--------------------");

        Square square = new Square(10);
        System.out.println(square);
        System.out.println("--------------------");

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        System.out.println("--------------------");

        Triangle triangle = new Triangle(10, 10, 10);
        System.out.println(triangle);
        System.out.println("--------------------");

        Triangle triangle2 = new Triangle(7, 7, 5);
        System.out.println(triangle2);
        System.out.println("--------------------");

        Triangle triangle3 = new Triangle(5, 12, 13);
        System.out.println(triangle3);
        System.out.println("--------------------");

    }
}
