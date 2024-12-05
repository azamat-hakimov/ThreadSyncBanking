package com.portfolio.app;

import com.portfolio.app.model.BankAccount;

public class BankTask implements Runnable{
    
    private BankAccount account;

    public BankTask(BankAccount account){
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(100);
        account.withdraw(60);
    }

}
