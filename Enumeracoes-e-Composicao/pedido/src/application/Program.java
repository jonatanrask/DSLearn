package application;

/*
Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido. Nota: o instante do pedido deve ser
o instante do sistema: new Date()
 */

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDay = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDay);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        int quantity = sc.nextInt();
        Date instantDate = new Date();
        Order order = new Order(instantDate, OrderStatus.valueOf(status), client);
        
        System.out.println("ORDER SUMMARY:");
        for(int i = 1; i <= quantity; i++)  {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            Product product = new Product(productName, price);
            OrdemItem ordemItem = new OrdemItem(quantityProduct, product.getPrice(), product);
            order.addItem(ordemItem);
        }
        System.out.println(order);
    }
}
