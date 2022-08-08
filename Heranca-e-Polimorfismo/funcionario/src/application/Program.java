package application;

/*
Uma empresa possui funcionários próprios e terceirizados.
Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado
possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora
multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus
correspondente a 110% de sua despesa adicional.
Fazer um programa para ler os dados de N funcionários (N
fornecido pelo usuário) e armazená-los em uma lista. Depois
de ler todos os dados, mostrar nome e pagamento de cada
funcionário na mesma ordem em que foram digitados.
Construa o programa conforme projeto ao lado. Veja
exemplo na próxima página
 */

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
