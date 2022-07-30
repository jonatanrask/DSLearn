package application;
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantity = sc.nextInt();

        double[] vect = new double[quantity];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        System.out.println();
        for (int i = 0; i < vect.length; i++){
            System.out.print("VALORES = "+ vect[i] + "\n");
            sum += vect[i];
        }
        double avg = sum / vect.length;

        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f", avg);

        sc.close();
    }
}
