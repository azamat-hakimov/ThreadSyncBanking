package com.portfolio.app;

import com.portfolio.app.model.BankAccount;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        BankAccount myAccount = new BankAccount(30);
        Thread user1 = new Thread(new BankTask(myAccount));
        user1.start();

        Thread user2 = new Thread(new BankTask(myAccount));
        user2.start();

        user1.join();
        user2.join();

    }
}
