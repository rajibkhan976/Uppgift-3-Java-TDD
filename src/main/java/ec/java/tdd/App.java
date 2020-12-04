package ec.java.tdd;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] certificates = {"Diploma 1", "Diploma 2"};
        String[] languages = {"JavaScript"};
        SoftwareEngineer rajib = new SoftwareEngineer(1, "Rajib", 25000, LocalDate.of(2020,10,18), certificates, languages);
        System.out.println(rajib.calculateSalary());
        String[] clients = {"Tanzim", "Sourav"};
        int acquiredClient = 0;
        SalesPerson jewel = new SalesPerson(2, "Jewel", 25000, LocalDate.of(2020,10,18), clients, acquiredClient);
        System.out.println(jewel.calculateSalary());
    }
}
