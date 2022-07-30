package application;
/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai ter o vetor: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        double med = 0;
        double sum = 0;
        for(int i = 0; i < vector.length; i++){
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextInt();
            if(vector[i] % 2 == 0){
                med += vector[i];
                sum += 1;
            }
        }

        if(med != 0){
            med /= sum;
            System.out.printf("MEDIA DOS PARES = %.1f", med);
        }else{
            System.out.print("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
