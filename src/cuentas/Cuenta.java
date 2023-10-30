package cuentas;

public class Cuenta {
    public enum TypeAccount {AHORRO, CORRIENTE}

    private final TypeAccount typeAccount;
    private final String nombres;
    private final String apellidos;
    private final String id;
    private double saldo;

    // Constructor
    public Cuenta(TypeAccount typeAccount, String nombres, String apellidos, String id) {
        this.typeAccount = typeAccount;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.saldo = 0;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    // To String
    @Override
    public String toString() {
        return "Cuenta: " + typeAccount + "\n" +
                "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "ID: " + id + "\n" +
                "Saldo actual: " + saldo + "\n";
    }

    // Methods
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + this.getSaldo());
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Se ha depositado el monto a la cuenta");
            this.consultarSaldo();
        } else {
            System.out.println("No se puede depositar el monto ingresado");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Se ha retirado el monto de la cuenta");
            this.consultarSaldo();
        } else {
            System.out.println("No se puede retirar el monto ingresado");
        }
    }
}
