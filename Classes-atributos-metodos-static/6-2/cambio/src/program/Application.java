package program;
/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma
pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a
pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para
ser responsável pelos cálculos.
 */
import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar? ");
        double dolar = sc.nextDouble();

        System.out.print("Quantos dolares serão comprados? ");
        double quantity = sc.nextDouble();

        double total = Calculator.currencyConverter(dolar, quantity);

        System.out.print("Valor a ser pago em reais = " + String.format("%.2f", total));



        sc.close();
    }
}
