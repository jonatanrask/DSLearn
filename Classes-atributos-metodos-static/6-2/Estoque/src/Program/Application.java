package Program;
/*
Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida: • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque) • Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
Para resolver este problema, você deve criar
uma CLASSE conforme projeto ao lado:
 */
import Product.Entity;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Entity product;
        product = new Entity();

        System.out.println("Enter de product data ");
        System.out.print("Name: ");
        product.name = sc.next();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());
        System.out.printf("Update data: " + product);

        sc.close();

    }
}
