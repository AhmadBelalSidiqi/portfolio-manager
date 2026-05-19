package com.pluralsight.finance;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    @Override
    public double getValue() {
        return balance*-1;
    }

    public void charge(double amount){
        this.balance += amount;
    }

    public void pay(double amount){
        this.balance -= amount;
    }

}
