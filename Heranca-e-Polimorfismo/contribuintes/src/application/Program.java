package application;

/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00
 */

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
