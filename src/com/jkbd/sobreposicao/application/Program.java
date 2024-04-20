package com.jkbd.sobreposicao.application;

import com.jkbd.sobreposicao.entities.Account;
import com.jkbd.sobreposicao.entities.BusinessAccount;
import com.jkbd.sobreposicao.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(100, "Jayanne", 1000.00);
        acc1.withdraw(200.0);
        System.out.println("Account: " + acc1.getBalance());

        Account acc2 =  new SavingsAccount(101, "Samarah", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println("Savings Account: " +acc2.getBalance());

        Account acc3 = new BusinessAccount(102, "Miguel", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println("Business Account: " + acc3.getBalance());

    }
}
