package application;

import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawnLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawnLimit);

            System.out.print("Enter amount for withdraw: ");
            double withdrawn = sc.nextDouble();
            account.withdraw(withdrawn);
            System.out.println(account);
        }
        catch (RuntimeException exception){
            System.out.println("Withdraw error: " + exception.getMessage());
        }
    }
}
