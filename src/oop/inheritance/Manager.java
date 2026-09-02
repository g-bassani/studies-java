package oop.inheritance;

import java.time.LocalDate;

public class Manager extends Employee {

    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, double salary, LocalDate birthDay, double bonus, Role role) {
        super(name, salary, birthDay, role);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double totalSalary() {
        return getSalary() + bonus;
    }
}
