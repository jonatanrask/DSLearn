package application;
/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */
import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        People[] people = new People[n];

        for(int i = 0; i < people.length; i++){
            System.out.println("Dados da "+ (i + 1) + "a pessoa:");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Idade: ");
            int age = input.nextInt();
            System.out.print("Altura: ");
            double height = input.nextDouble();

            people[i] = new People(name, age, height);
        }
        double sum = 0;
        double ageMed = 0;
        for(int i = 0; i < people.length; i++){
            sum += people[i].getHeight();
            if (people[i].getAge() < 16){
                ageMed += 1;
            }
        }
        double media = sum / people.length;
        double porcent = (ageMed * 100) / people.length;

        System.out.printf("\nAltura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f" + "%%\n", porcent);
        for(int i = 0; i < people.length; i++){
            if(people[i].getAge() < 16){
                System.out.println(people[i].getName());
            }
        }




    }
}
