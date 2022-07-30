package application;
/*
Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.
 */
import java.util.ArrayList;
import java.util.List;
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

        int[][] matriz = new int[m][n];
        List<Integer> negatives = new ArrayList<>();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if ( matriz[i][j] < 0){
                    negatives.add(matriz[i][j]);
                }
            }
        }
        System.out.println("VALORES NEGATIVOS:");
        for (int negative : negatives){
            System.out.println(negative);
        }

    }
}
