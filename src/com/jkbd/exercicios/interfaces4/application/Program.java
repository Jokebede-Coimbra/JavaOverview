package com.jkbd.exercicios.interfaces4.application;

import com.jkbd.exercicios.interfaces4.entities.Contract;
import com.jkbd.exercicios.interfaces4.entities.Installment;
import com.jkbd.exercicios.interfaces4.service.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);


        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(null);
        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

    }
}
