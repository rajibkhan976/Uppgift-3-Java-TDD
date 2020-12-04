package ec.java.tdd;

import java.time.LocalDate;

public class SoftwareEngineer extends Employee {

    private String[] certificates;
    private String[] languages;

    public SoftwareEngineer(int id, String name, double salary, LocalDate dateHired, String[] certificates, String[] languages) {
        super(id, name, salary, dateHired);
        this.certificates = certificates;
        this.languages = languages;
    }

    public String[] getCertificates() {
        return this.certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return this.languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public double calculateSalary() {

        double salary = getSalary();

        if (certificates.length != 0) {
            salary += certificates.length * 1000;
        }

        if (languages.length != 0) {
            salary += languages.length * 1500;
        }

        return salary;
    }
}
