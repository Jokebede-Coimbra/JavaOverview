package com.jkbd.interfaces.solucaoproblema.application;

import com.jkbd.interfaces.solucaoproblema.entities.CarRental;
import com.jkbd.interfaces.solucaoproblema.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Locale.setDefault(Locale.US);

        System.out.println(" Enter rental data: ");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.next(), fmt);
        System.out.println("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.next(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.println("Enter price per hour: ");
        System.out.println("Enter price per day:");
        System.out.println("INVOICE");
        System.out.println("Basic payment:");
        System.out.println("Tax:");
        System.out.println("Total payment:");


    }
}
