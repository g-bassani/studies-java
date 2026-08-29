package oop.polymorphism;

public class NaturalPerson extends Person {

    private double medicalExpenses;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, double annualIncome, double medicalExpenses) {
        super(name, annualIncome);
        this.medicalExpenses = medicalExpenses;
    }

    public double getMedicalExpenses() {
        return medicalExpenses;
    }

    public void setMedicalExpenses(double medicalExpenses) {
        this.medicalExpenses = medicalExpenses;
    }

    @Override
    public double taxCalculation() {
        double tax;

        if (getAnnualIncome() < 20000.00) {
            tax = 0.15;

        }else {
            tax = 0.25;

        }
        if (medicalExpenses > 0) {
            return (getAnnualIncome() * tax) - (medicalExpenses * 0.5);

        }else {
            return getAnnualIncome() * tax;

        }
    }
}
