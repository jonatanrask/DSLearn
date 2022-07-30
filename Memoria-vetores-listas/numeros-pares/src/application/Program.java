package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] number = new int[n];
        int qnt = 0;
        int controller = 0;
        for(int i = 0; i < number.length; i++){
            System.out.print("Digite um numero: ");
            number[i] = sc.nextInt();
            if(number[i] % 2 == 0) {
                qnt += 1;
            }
        }
        int[] pair = new int[qnt];
        int arrange = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0) {
                pair[arrange] = number[i];
                arrange += 1;
            }
        }
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < pair.length; i++){
            System.out.print(pair[i] + " ");
        }
        System.out.println("\nQUANTIDADE DE PARES = " + qnt);

    }
}
