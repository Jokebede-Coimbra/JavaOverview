package com.jkbd.heranca.polimorfismo.application;

import com.jkbd.heranca.polimorfismo.entities.Account;
import com.jkbd.heranca.polimorfismo.entities.BusinessAccount;
import com.jkbd.heranca.polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(100, "Jayanne", 10.00);
        BusinessAccount bacc = new BusinessAccount(1001, "Samarah", 5.00, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1002, "Jacson", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1003, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

         // BusinessAccount acc5 = (BusinessAccount)acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
