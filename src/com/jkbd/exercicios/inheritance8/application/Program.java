package com.jkbd.exercicios.inheritance8.application;

import com.jkbd.exercicios.inheritance8.entities.Company;
import com.jkbd.exercicios.inheritance8.entities.Individual;
import com.jkbd.exercicios.inheritance8.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.println("Number of employees: ");
                Integer numberEmployees = sc.nextInt();
                taxPayerList.add(new Company(name, anualIncome, numberEmployees));
            }

        }
        System.out.println("");
        System.out.println("TAXES PAID: ");

        for (TaxPayer tax : taxPayerList) {
            System.out.println(tax.getName() + ": $" + String.format("%.2f", tax.tax()));
        }

        double sum = 0.0;
        for (TaxPayer taxP : taxPayerList) {
            sum += taxP.tax();

        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));


    }
}
