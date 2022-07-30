package application;
/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */
import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar ");
        int n = sc.nextInt();
        People[] people = new People[n];

        int old = 0;
        int controller = 0;
        for(int i = 0; i < people.length; i++){
            System.out.println("Dados da "+ (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            people[i] = new People(name, age);
            if (people[i].getAge() > old){
                old = people[i].getAge();
                controller = i;
            }
        }
        System.out.print("PESSOA MAIS VELHA: " + people[controller].getName());

        sc.close();

    }
}
