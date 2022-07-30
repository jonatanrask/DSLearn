/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
 */
import java.util.Scanner;


public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures os triangle X: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;

        double xArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Enter the measures os triangle Y: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        sc.close();

       p = (a + b + c) / 2;

        double yArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("Triangle X area: %.4f\n", xArea);
        System.out.printf("Triangle Y area: %.4f\n", yArea);

        if (xArea > yArea){
            System.out.println("Larger area: X");
        }
        if (xArea < yArea) {
            System.out.println("Larger area: Y");
        }
        else {
            System.out.println("Both areas are the same");
        }




    }
}
