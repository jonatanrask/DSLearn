package entities;

public class Account {
    private int accountNumber;
    private String accountName;
    private double accountBalance;

    private final double tax = 5;

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double accountDeposit(double deposit){
        return this.accountBalance += deposit;
    }

    public double accountWithdraw(double withdraw){
        return this.accountBalance -= withdraw + tax;
    }
    public String toString(){
        return "data: \nAccount "
                + accountNumber
                + ", Holder: "
                + accountName
                + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }
}
