package cuentas;

import cuentas.subclass.Ahorro;
import cuentas.subclass.Corriente;

public class Main {
    public static void main(String[] args) {
        Ahorro cuentaAhorro = new Ahorro(Cuenta.TypeAccount.AHORRO, "Juan", "Perez", "123456789", 0.1);
        System.out.println(cuentaAhorro);
        cuentaAhorro.depositar(100);
        System.out.println();
        cuentaAhorro.aplicarInteres();
        System.out.println();
        cuentaAhorro.retirar(50);
        System.out.println("--------------------");

        Ahorro cuentaAhorro2 = new Ahorro(Cuenta.TypeAccount.AHORRO, "Maria", "Lopez", "987654321", 0.1);
        cuentaAhorro.depositar(2000);
        cuentaAhorro2.depositar(1000);
        if (cuentaAhorro.compararSaldo(cuentaAhorro2)) {
            System.out.println("La cuenta 1 tiene mayor saldo");
        } else {
            System.out.println("La cuenta 2 tiene mayor saldo");
        }
        cuentaAhorro.transferir(cuentaAhorro2, 5000);
        cuentaAhorro.consultarSaldo();
        cuentaAhorro2.consultarSaldo();
        System.out.println("--------------------");


        Corriente cuentaCorriente = new Corriente(Cuenta.TypeAccount.CORRIENTE, "Pedro", "Gomez", "123456789");
        System.out.println(cuentaCorriente);
        System.out.println(cuentaCorriente.getActiva());
        cuentaCorriente.depositar(100);
        System.out.println(cuentaCorriente.getActiva());
        System.out.println("--------------------");
    }
}
