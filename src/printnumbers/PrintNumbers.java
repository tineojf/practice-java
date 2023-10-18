package printnumbers;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        int userNumber = inNumber();
        printNumbers(userNumber);
    }

    public static int inNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter a number(1-5000): ");
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public static void printNumbers(int _number) {
        for (int i = 1; i <= _number; i++) {
            System.out.println("Number: " + i);
        }
    }
}

