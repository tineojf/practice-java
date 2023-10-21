package imc;

import java.util.Scanner;

public class IMC {
    private double weight;
    private double height;
    private double imc;
    private String classification;
    private double[] imcTable;
    private String[] classificationTable;

    // Constructor
    public IMC() {
        this.weight = 0.0;
        this.height = 0.0;
        this.imc = 0.0;
        this.classification = "";
    }

    public IMC(double _weight, double _height) {
        this.weight = _weight;
        this.height = _height;
        this.imc = 0.0;
        this.classification = "";
    }

    // Getters & Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getImc() {
        return imc;
    }

    public void setIMC() {
        double imc = this.weight / (this.height * this.height);
        this.imc = Math.round(imc * 100.0) / 100.0;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification() {
        this.classification = this.classificationTable[this.classificationTable.length - 1];

        for (int i = 0; i < this.imcTable.length; i++) {
            if (this.imc < this.imcTable[i]) {
                this.classification = this.classificationTable[i];
                return;
            }
        }
    }

    public double[] getImcTable() {
        return imcTable;
    }

    public void setImcTable(double[] imcTable) {
        this.imcTable = imcTable;
    }

    public String[] getClassificationTable() {
        return classificationTable;
    }

    public void setClassificationTable(String[] classificationTable) {
        this.classificationTable = classificationTable;
    }

    // To String
    @Override
    public String toString() {
        return "IMC: " + this.imc + "\n" + "Classification: " + this.classification;
    }

    // Methods
    public double inputData() {
        Scanner input = new Scanner(System.in);
        double value;
        try {
            value = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid value.");
            value = -1.0;
        }
        return value;
    }

    public void loadClassificationTable(String[] _imcDesc, double[] _imcValue) {
        this.setClassificationTable(_imcDesc);
        this.setImcTable(_imcValue);
    }

    public void operationMain() {
        if (this.imcTable == null || this.classificationTable == null) {
            System.out.println("Load the default classification table and try again.");
            return;
        }

        System.out.println("Enter your height (m): ");
        this.height = this.inputData();
        System.out.println("Enter your weight (kg): ");
        this.weight = this.inputData();

        System.out.println("--------------------");
        if (this.weight == -1.0 || this.height == -1.0) {
            System.out.println("Can't calculate IMC.");
            System.out.println("Introduce correct values.");
            return;
        }
        this.setIMC();
        this.setClassification();
        System.out.println(this);
        System.out.println("--------------------");
    }
}