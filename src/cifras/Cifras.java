package cifras;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        System.out.println("Cifras");
        try {
            int number = intData("number");

            if (number < 0) {
                throw new Exception("The number must be positive");
            }

            System.out.println("Suma de cifras: " + sumaCifras(number));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int sumaCifras(int _number) {
        int suma = 0;
        while (_number != 0) {
            suma += _number % 10;
            _number /= 10;
        }
        return suma;
    }

    public static int intData(String _data) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of " + _data + ": ");
        return sc.nextInt();
    }
}
