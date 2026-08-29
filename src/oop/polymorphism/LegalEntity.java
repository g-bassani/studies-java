package oop.polymorphism;

public class LegalEntity extends Person {

    private int numberOfEmployees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double taxCalculation() {
        double tax;

        if (numberOfEmployees < 10) {
            tax = 0.16;

        }else {
            tax = 0.14;
        }
        return getAnnualIncome() * tax;

    }
}
