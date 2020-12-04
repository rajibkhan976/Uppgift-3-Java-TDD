package ec.java.tdd;

import java.time.LocalDate;

public abstract class Employee {

    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    public Employee (int id, String name, double salary, LocalDate dateHired) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public abstract double calculateSalary();
}
