package application;
/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */
import entities.People;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas ");
        int n = sc.nextInt();
        People[] people = new People[n];
        double largerPeople = 0, smallerPeople = 100, medWomans = 0;
        int qntMens = 0, qntWomans = 0;

        for(int i = 0; i < people.length; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            String genre = sc.next();

            people[i] = new People(height, genre);

            if(people[i].getHeight() > largerPeople){
                largerPeople = people[i].getHeight();
            }
            if(people[i].getHeight() < smallerPeople){
                smallerPeople = people[i].getHeight();
            }
            if(Objects.equals(people[i].getGenre(), "F")){
                medWomans += people[i].getHeight();
                qntWomans += 1;
            }
            if(Objects.equals(people[i].getGenre(), "M")){
                qntMens += 1;
            }


        }
        medWomans /= qntWomans;

        System.out.printf("Menor altura = %.2f\n", smallerPeople);
        System.out.printf("Maior altura = %.2f\n", largerPeople);
        System.out.printf("Media das alturas das mulheres %.2f\n", medWomans);
        System.out.print("Numero de homens = " + qntMens);
    }
}
