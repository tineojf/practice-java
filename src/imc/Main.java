package imc;

public class Main {
    public static void main(String[] args) {
        String[] imcDescripciones = {"Imposible", "Delgadez severa", "Delgadez moderada", "Delgadez leve",
                "Peso normal", "Sobrepeso", "Obesidad leve", "Obesidad moderada", "Obesidad morbida"};
        double[] imcValores = {0, 16, 17, 18.5, 25, 30, 35, 40};

        IMC imc = new IMC();
        imc.loadClassificationTable(imcDescripciones, imcValores);
        imc.operationMain();
    }
}
