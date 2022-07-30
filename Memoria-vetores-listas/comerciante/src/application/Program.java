package application;
/*
Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total.
 */
import entities.Merchandise;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Serao digitados dados de quantos produtos? ");
        int n = sc.nextInt();

        Merchandise[] merchandise = new Merchandise[n];

        int profit1 = 0, profit2 = 0, profit3 = 0;
        double totalPurchase = 0, totalSale = 0;
        for(int i = 0; i < merchandise.length; i++){
            System.out.println("Produto " + (i + 1));
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Preco da compra: ");
            double purchasePrice = sc.nextDouble();
            System.out.print("Preco da venda: ");
            double salePrice = sc.nextDouble();

            merchandise[i] = new Merchandise(name, purchasePrice, salePrice);


            if (merchandise[i].porcentMerchandiseProfit(merchandise[i].getPricePurchase(), merchandise[i].getPriceSale()) < 10){
                profit1 += 1;
            }
            if (merchandise[i].porcentMerchandiseProfit(merchandise[i].getPricePurchase(), merchandise[i].getPriceSale()) >= 10 &&
                    merchandise[i].porcentMerchandiseProfit(merchandise[i].getPricePurchase(), merchandise[i].getPriceSale()) <= 20){
                profit2 += 1;
            }
            if (merchandise[i].porcentMerchandiseProfit(merchandise[i].getPricePurchase(), merchandise[i].getPriceSale()) > 20){
                profit3 += 1;
            }
            totalPurchase += merchandise[i].getPricePurchase();
            totalSale += merchandise[i].getPriceSale();
        }
        System.out.println("\nRELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + profit1);
        System.out.println("Lucro entre 10% e 20%: " + profit2);
        System.out.println("Lucro acima de 20%: " + profit3);
        System.out.printf("Valor total de compra: %.2f\n", totalPurchase);
        System.out.printf("Valor total de venda: %.2f\n", totalSale);
        System.out.printf("Lucro total: %.2f\n", (totalSale - totalPurchase));
    }
}
