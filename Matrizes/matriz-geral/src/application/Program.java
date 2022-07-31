package application;

/*
Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
a matriz alterada.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        double[][] matriz = new double[n][n];
        double sum = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print("Digite os elementos da [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextDouble();
                if(matriz[i][j] > 0){
                    sum += matriz[i][j];
                }
            }
        }
        System.out.println("\nSOMA DOS POSITIVOS: "    + sum);
        System.out.print("\nEscolha uma linha: ");
        int l = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA:");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(" " + matriz[l][i]);
        }
        System.out.println();
        System.out.print("\nEscolha uma coluna: ");
        int c = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA:");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(" " + matriz[i][c]);
        }
        System.out.println();
        System.out.print("\nDIAGONAL PRINCIPAL:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j){
                    System.out.print(" " + matriz[i][j]);

                }
            }
        }
        System.out.println();
        System.out.println("\nMATRIZ ALTERADA: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] < 0){
                    matriz[i][j] *= matriz[i][j];
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }




        sc.close();
    }




}

