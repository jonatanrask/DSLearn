package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vector = new double[n];
        double media = 0.0;

        for(int i = 0; i < vector.length; i++){
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
            media += vector[i];
        }
        media /= vector.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < media){
                System.out.println(vector[i]);
            }
        }


        sc.close();


    }
}
