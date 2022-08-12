package model.entities;

import model.exception.ReservationException;

public class Account {
    private Integer number;
    private String  holder;
    private Double balance;
    private Double withdrawnLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawnLimit) {
        if(balance == 0){
            throw new ReservationException("Not enough balance");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawnLimit = withdrawnLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawnLimit() {
        return withdrawnLimit;
    }

    public void setWithdrawnLimit(Double withdrawnLimit) {
        this.withdrawnLimit = withdrawnLimit;
    }
    public void deposit(Double amount){
        double deposit = balance + amount;
        this.balance = deposit;
    }
    public void withdraw(Double amount){
        if(balance < amount){
            throw new ReservationException("Not enough balance");
        }
        if (amount > withdrawnLimit){
            throw new ReservationException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }
    public String toString(){
        return "New balance: "
                + String.format("%.2f", getBalance());
    }
}
