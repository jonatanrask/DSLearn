package application;
/*
Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
negativos da matriz.
 */
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        int negative = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print("Elemento [" + (i) + "," + (j) +"]: ");
                int element = sc.nextInt();
                matriz[i][j] = element;
                if(matriz[i][j] < 0){
                    negative++;
                }
            }
        }
        System.out.println("DIAGONAL PRINCIPAL:");
        int horizontal = 0;
        for(int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][horizontal++] + " ");
        }
        System.out.print("\nQUANTIDADE DE NEGATIVOS = " + negative);

        sc.close();
    }
}
