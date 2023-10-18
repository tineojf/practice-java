package registro;

import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        String dni, name, nameExit = "fin", dniExit = "0";
        int age;
        System.out.println("Registro de personas");

        dni = inputData("DNI");
        name = inputData("Nombre");
        age = inputAge("Edad");

        if (!name.equalsIgnoreCase(nameExit) && !dni.equalsIgnoreCase(dniExit) && age >= 6) {
            System.out.println(printInfo(dni, name, age, knowCategory(age)));
        } else {
            System.out.println("Ingresa datos validos");
        }
    }

    public static String printInfo(String _dni, String _name, int _age, String _category) {
        return "--------------------------------\n"
                + "Datos de la persona:\n"
                + "DNI: " + _dni + "\n"
                + "Nombre: " + _name + "\n"
                + "Edad: " + _age + "\n"
                + "Categoria: " + _category + "\n"
                + "--------------------------------";
    }

    public static String inputData(String _message) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese " + _message + ": ");
        return input.nextLine();
    }

    public static int inputAge(String _message) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese " + _message + ": ");
        return input.nextInt();
    }

    public static String knowCategory(int _age) {
        if (_age >= 6 && _age <= 10) {
            return "Menores A";
        } else if (_age >= 11 && _age <= 17) {
            return "Menores B";
        } else if (_age >= 18 && _age <= 30) {
            return "Juveniles";
        } else if (_age >= 31 && _age <= 50) {
            return "Adultos";
        } else if (_age >= 51) {
            return "Adultos mayores";
        } else {
            return "No se encuentra en ninguna categoria";
        }
    }
}
