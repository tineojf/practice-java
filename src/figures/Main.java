package figures;

import figures.subclass.Circle;
import figures.subclass.Rectangle;
import figures.subclass.Square;

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
    }
}
