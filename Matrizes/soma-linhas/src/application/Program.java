package application;
/*
Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int m = sc.nextInt();

        System.out.print("Qual a quantidade de colunas da matriz? ");
        int n = sc.nextInt();

        double[][] matriz = new double[m][n];
        double[] vect = new double[m];
        for (int i = 0; i < m; i++){
            double sum = 0;
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
            for (int j = 0; j < n; j++){
                double element = sc.nextDouble();
                sum += element;
            }
            vect[i] = sum;
        }
        System.out.println("VETOR GERADO:");
        for (double x : vect){
            System.out.printf("%.1f\n",x);
        }
        sc.close();
    }
}
