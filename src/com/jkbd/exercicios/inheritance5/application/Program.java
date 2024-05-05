package com.jkbd.exercicios.inheritance5.application;

import com.jkbd.exercicios.inheritance5.entities.ImportedProduct;
import com.jkbd.exercicios.inheritance5.entities.Product;
import com.jkbd.exercicios.inheritance5.entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> prodList = new ArrayList<>();


        System.out.println("Enter the number of products:  ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.println(" Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();


            if (ch == 'c') {
                prodList.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                prodList.add(new UsedProduct(name, price, date));
            } else {

                System.out.println("Customs fee: ");
                Double customsFree = sc.nextDouble();
                prodList.add(new ImportedProduct(name, price, customsFree));
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : prodList) {
            System.out.println(product.priceTag());
        }
        sc.close();

    }
}
