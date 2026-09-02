package collections.comparable;

import java.time.LocalDate;

public class Expense implements Comparable<Expense> {

    private LocalDate expenseDate;
    private String name;
    private double value;

    public Expense(LocalDate expenseDate, double value, String name) {
        this.value = value;
        this.name = name;
        this.expenseDate = expenseDate;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Expense other) {
        return expenseDate.compareTo(other.getExpenseDate());
    }
}
