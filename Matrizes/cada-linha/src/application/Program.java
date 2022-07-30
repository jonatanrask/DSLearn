package application;
/*
Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
de cada linha. Suponha não haver empates.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int large = 0;
        int[][] matriz = new int[n][n];
        List<Integer> larger = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if(j == 0){
                   large = matriz[i][j];
                }
                if(j > 0 && matriz[i][j] > large){
                    large =  matriz[i][j];
                }
            }
            larger.add(large);
        }
        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
        for (int element : larger){
            System.out.println(element);
        }

        sc.close();
    }
}
