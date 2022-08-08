package application;

import entities.LegalPerson;
import entities.People;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<People> payers = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int numberOfPayers = sc.nextInt();
        for(int i = 0; i < numberOfPayers; i++){
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (type == 'i'){
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();
                payers.add(new PhysicalPerson(name, annualIncome, healthSpending));
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                payers.add(new LegalPerson(name, annualIncome, numberOfEmployees));
            }
        }
        double sum = 0;
        System.out.println("\nTAXES PAID:");

        for (People p : payers){
            System.out.print(p.getName());
            System.out.print(": $ ");
            System.out.printf("%.2f\n", p.tax());
            sum += p.tax();
        }
        System.out.print("\nTOTAL TAXES: $ ");
        System.out.printf("%.2f", sum);
        sc.close();
    }
}
