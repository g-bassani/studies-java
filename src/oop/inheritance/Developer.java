package oop.inheritance;

import java.time.LocalDate;

public class Developer extends Employee {

    int completedProjects;

    public Developer() {
        super();
    }

    public Developer(String name, double salary, LocalDate birthDay, int completedProjects, Role role) {
        super(name, salary, birthDay, role);
        this.completedProjects = completedProjects;
    }

    public int getCompletedProjects() {
        return completedProjects;
    }

    public void setCompletedProjects(int completedProjects) {
        this.completedProjects = completedProjects;
    }

    @Override
    public double totalSalary() {
        return getSalary() + completedProjects * 500;
    }
}
