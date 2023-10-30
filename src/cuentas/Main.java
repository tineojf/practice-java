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
    }
}
