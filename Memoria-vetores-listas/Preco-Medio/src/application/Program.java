package application;
/*
Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
 */
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0, avg;

        int n = sc.nextInt();
        Product[] product = new Product[n];

        for(int i = 0; i < product.length; i++){
            String name = sc.next();
            double price = sc.nextDouble();

            product[i] = new Product(name, price);
        }
        for(int i = 0; product.length < n; i++){
            sum+= product[i].getPrice();
        }
        avg = sum / product.length;

        System.out.printf("AVERAGE PRICE = %.2f", avg);




        sc.close();
    }
}
