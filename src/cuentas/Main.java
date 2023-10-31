package cuentas;

import cuentas.subclass.Ahorro;

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
        cuentaAhorro.compararSaldo(cuentaAhorro2);
        cuentaAhorro.transferir(cuentaAhorro2, 5000);
        cuentaAhorro.consultarSaldo();
        cuentaAhorro2.consultarSaldo();
        System.out.println("--------------------");
    }
}
