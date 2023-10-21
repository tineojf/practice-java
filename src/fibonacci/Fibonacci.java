package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    private int elements;

    // Constructor
    public Fibonacci() {
    }

    // Getters and Setters
    public int getElements() {
        return elements;
    }

    public void setElements(int elements) {
        this.elements = elements;
    }

    // Methods
    public void operationMain() {
        System.out.print("Introduce the number of elements: ");
        this.elements = inputData();

        if (this.elements == -1) {
            System.out.println("Introduce valid values. Try again.");
            return;
        }

        System.out.println("The Fibonacci sequence is: ");
        for (int i = 1; i <= this.elements; i++) {
            System.out.print(sequence(i) + " ");
        }
    }

    public int sequence(int _elements) {
        int anterior, posterior;

        if (_elements == 1) {
            return 0;
        } else if (_elements == 2) {
            return 1;
        } else {
            anterior = sequence(_elements - 1);
            posterior = sequence(_elements - 2);
            return anterior + posterior;
        }
    }

    public int inputData() {
        Scanner input = new Scanner(System.in);
        int elements;

        try {
            elements = input.nextInt();
            if (elements <= 0) throw new Exception("Only positive numbers are allowed.");
            return elements;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            elements = -1;
        }

        return elements;
    }
}
