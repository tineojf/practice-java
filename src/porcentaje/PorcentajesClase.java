package porcentaje;

import java.util.Scanner;

public class PorcentajesClase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hombre, mujer, total;

        hombre = ingresarValor("hombres");
        mujer = ingresarValor("mujeres");
        total = hombre + mujer;

        System.out.println("Porcentaje de hombres: " + obtenerPorcentaje(hombre, total) + "%");
        System.out.println("Porcentaje de mujeres: " + obtenerPorcentaje(mujer, total) + "%");
    }

    public static double ingresarValor(String _name) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cantidad de " + _name);
        double valor = scan.nextDouble();

        if (valor < 0) {
            System.out.println("El valor debe ser positivo");
            valor = ingresarValor(_name);
        }
        return valor;
    }

    public static double obtenerPorcentaje(double _valor, double _total) {
        double resultado;
        resultado = (_valor * 100) / _total;
        resultado = Math.round(resultado * 100) / 100.0;
        return resultado;
    }
}
