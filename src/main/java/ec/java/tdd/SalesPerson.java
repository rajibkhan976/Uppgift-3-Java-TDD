package ec.java.tdd;

import java.time.LocalDate;

public class SalesPerson extends Employee {

    private String[] clients;
    private int acquiredClients;

    public SalesPerson(int id, String name, double salary, LocalDate dateHired, String[] clients, int acquiredClients) {
        super(id, name, salary, dateHired);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
    }

    public String[] getClients() {
        return this.clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return this.acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    public double calculateSalary() {

        double salary = getSalary();

        if (clients.length != 0) {
            salary += clients.length * 500;
        }

        if (acquiredClients != 0 && acquiredClients > 0) {
            salary += acquiredClients * 1000;
        }
        return salary;
    }
}
