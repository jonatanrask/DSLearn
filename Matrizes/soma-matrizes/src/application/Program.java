package application;
/*
Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
 */
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int m = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz matriz? ");
        int n = sc.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        int[][] matrizSoma = new int[m][n];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIZ SOMA");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
