package com.jkbd.generics.hashcodeequals.application;

import com.jkbd.generics.hashcodeequals.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client client1 = new Client("Jayanne", "jay@gmail.com");
        Client client2 = new Client("Jayanne", "jos@gmail.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client1.equals(client2));
        System.out.println(client1 == client2);


    }
}
