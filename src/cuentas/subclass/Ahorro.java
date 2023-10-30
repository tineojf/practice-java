package cuentas.subclass;

public class Ahorro extends cuentas.Cuenta {
    private final double interes;

    // Constructor
    public Ahorro(TypeAccount typeAccount, String nombres, String apellidos, String id, double interes) {
        super(TypeAccount.AHORRO, nombres, apellidos, id);
        this.interes = interes;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() +
                "Interes: " + interes + "\n";
    }

    // Methods
    public void aplicarInteres() {
        double interes = this.getSaldo() * this.interes;
        this.depositar(interes);
    }

}
