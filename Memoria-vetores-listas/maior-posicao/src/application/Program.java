package application;
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double larger = 0.0;
        int position = 0;

        System.out.print("Quantos numeros você quer digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            if(vect[i] > larger){
                larger = vect[i];
                position = i;
            }
        }
        System.out.printf("\nMAIOR VALOR = %.2f\n", larger);
        System.out.print("POSICAO DO MAIOR VALOR = " + position);
    }
}
