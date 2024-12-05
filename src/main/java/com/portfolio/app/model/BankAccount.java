package com.portfolio.app.model;

public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance){
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount){
        System.out.println("Your balance: " + getBalance());
        if (amount <= balance){
            System.out.println("Withdrawing the amount: " + amount);
            balance = balance - amount;
            System.out.println("Balance after withdraw: " + balance);
        }else {
            System.out.println("Not enough money in balance!");
        }
    }

    public synchronized void deposit(int amount){
        System.out.println("Your balance: " + balance);
        System.out.println("Depositing the amount: " + amount);
        balance = balance + amount;
        System.out.println("Balance after deposit: " + balance);

    }

    public int getBalance() {
        return balance;
    }
}
