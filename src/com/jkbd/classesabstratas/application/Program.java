package com.jkbd.classesabstratas.application;


import com.jkbd.classesabstratas.entities.Account;
import com.jkbd.classesabstratas.entities.BusinessAccount;
import com.jkbd.classesabstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // A classe Account não pode ser instânciada
        // Account acc1 = new Account(100, "Jayanne", 1000.00);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(100, "Samarah", 1000.0, 0.01));
        list.add(new SavingsAccount(101, "Jayanne", 2000.0, 0.01));
        list.add(new BusinessAccount(102, "Miguel", 800.0, 500.0));
        list.add(new BusinessAccount(103, "Jacson", 300.0, 500.0));

        double sum = 0.0;
        for (Account acc: list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc: list) {
            acc.deposit(10.0);
        }
        for (Account acc: list) {
            System.out.printf("Update balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }
    }
}
