package program;
/*
Fazer um programa para ler os dados de um
funcionário (nome, salário bruto e imposto).
Em seguida, mostrar os dados do funcionário
(nome e salário líquido). Em seguida,
aumentar o salário do funcionário com base
em uma porcentagem dada (somente o salário
bruto é afetado pela porcentagem) e mostrar
novamente os dados do funcionário. Use a
classe projetada ao lado.
 */

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salario Bruto ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionario: " + employee);

        System.out.print("Qual a porcentagem para aumentar o salalario? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println("Dados atualizados: " + employee);
        sc.close();
    }
}
