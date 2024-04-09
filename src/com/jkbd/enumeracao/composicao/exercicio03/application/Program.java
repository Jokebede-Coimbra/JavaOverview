package com.jkbd.enumeracao.composicao.exercicio03.application;

import com.jkbd.enumeracao.composicao.exercicio03.entities.Client;
import com.jkbd.enumeracao.composicao.exercicio03.entities.Order;
import com.jkbd.enumeracao.composicao.exercicio03.entities.OrderItem;
import com.jkbd.enumeracao.composicao.exercicio03.entities.Product;
import com.jkbd.enumeracao.composicao.exercicio03.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter cliente data: ");

        System.out.println(" Name: ");
        String name = sc.nextLine();
        System.out.println(" Email: ");
        String email = sc.nextLine();
        System.out.println(" Birth date (DD/MM/YYYY): ");
        Date dateBirth = sdf.parse(sc.next());

        Client client = new Client(name, email, dateBirth);

        System.out.println(" Enter order data: ");
        System.out.println(" Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.println(" How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println(" Enter # " + i + " item data: ");
            System.out.print(" Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.println(" Product price: ");
            Double priceProduct = sc.nextDouble();
            Product product = new Product(nameProduct, priceProduct);

            System.out.println(" Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, priceProduct, product);
            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        sc.close();

    }
}
