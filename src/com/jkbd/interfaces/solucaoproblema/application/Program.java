package com.jkbd.interfaces.solucaoproblema.application;

import com.jkbd.interfaces.solucaoproblema.entities.CarRental;
import com.jkbd.interfaces.solucaoproblema.entities.Vehicle;
import com.jkbd.interfaces.solucaoproblema.services.BrazilTaxService;
import com.jkbd.interfaces.solucaoproblema.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Locale.setDefault(Locale.US);

        System.out.println("Enter rental data");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day:");
        double pricePerDay = sc.nextDouble();


        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE");
        System.out.println("Basic payment:" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax:" + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment:" + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();

    }
}
