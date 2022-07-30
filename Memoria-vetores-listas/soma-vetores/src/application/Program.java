package application;
/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");
        int n = sc.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < vectorA.length; j++){
                if(i == 0){
                    if(j == 0){
                        System.out.println("Digite os valores do vetor A");
                    }
                    vectorA[j] = sc.nextInt();
                }
                if(i == 1){
                    if(j == 0){
                        System.out.println("Digite os valores do vetor B");
                    }
                    vectorB[j] = sc.nextInt();
                }
            }
        }
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vectorB.length; i++){
            System.out.println(vectorA[i] + vectorB[i]);
        }
    }
}
