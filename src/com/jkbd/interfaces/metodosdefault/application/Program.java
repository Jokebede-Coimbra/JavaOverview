package com.jkbd.interfaces.metodosdefault.application;

import com.jkbd.interfaces.metodosdefault.interfaces.InterestService;
import com.jkbd.interfaces.metodosdefault.service.BrazilInterestService;
import com.jkbd.interfaces.metodosdefault.service.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService bra = new BrazilInterestService(2.0);
        double paymentBRA = bra.payment(amount, months);

        InterestService usa = new UsaInterestService(1.0);
        double paymentUSA = usa.payment(amount, months);

        System.out.print("Payment BRA after " + months + " months: ");
        System.out.println(String.format("%.2f", paymentBRA));

        System.out.print("Payment USA after " + months + " months: ");
        System.out.println(String.format("%.2f", paymentUSA));


        sc.close();
    }
}
