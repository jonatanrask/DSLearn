package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantityEmployees = sc.nextInt();
        Employee[] employees = new Employee[quantityEmployees];

        for(int i = 1; i <= employees.length; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsorced (y/n)? ");
            char outsorced = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (outsorced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees[i - 1] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            }
            else {
                employees[i - 1] = new Employee(name, hours, valuePerHour);
            }
        }
        System.out.println("PAYMENTS:");
        for(Employee e : employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }
    }
}
