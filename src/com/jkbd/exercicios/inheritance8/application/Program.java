package com.jkbd.exercicios.inheritance8.application;

import com.jkbd.exercicios.inheritance8.entities.Individual;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.println("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            System.out.println("Health expenditures: ");
            Double healthExpenditures = sc.nextDouble();

            if (ch == 'i') {

            }

        }
        System.out.println("TAXES PAID: ");
        System.out.println("TOTAL TAXES: $");
        System.out.println("");

    }
}
