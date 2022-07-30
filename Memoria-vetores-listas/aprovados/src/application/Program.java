package application;
/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Student[] student = new Student[n];

        for(int i = 0; i < student.length; i++){
            System.out.print("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:\n");
            sc.nextLine();
            String name = sc.nextLine();
            double firstNote = sc.nextDouble();
            double secondNote = sc.nextDouble();

            student[i] = new Student(name, firstNote, secondNote);
        }
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < student.length; i++){
            if(student[i].isAproved(student[i].getFirstNote(), student[i].getSecondNote()) >= 6){
                System.out.println(student[i].getName());
            }
        }

        sc.close();
    }
}
