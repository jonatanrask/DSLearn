package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();
        Department department = new Department(departmentName);
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int quantityContracts = sc.nextInt();
        for (int i = 1; i <= quantityContracts; i++){
            System.out.println("Enter contract #" + i +" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            worker.addContract(new HourContract(date, valuePerHour, duration));
        }
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        double sum = worker.getBaseSalary();

        System.out.println("Name = " + worker.getName() + "\nDepartment:" + worker.getDepartment().getName() + "\nIncome for " +
                monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
