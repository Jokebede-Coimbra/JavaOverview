package com.jkbd.generics.map.application.demo1;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Jayanne");
        cookies.put("email", "jay@gmail.com");
        cookies.put("phone", "988745856");

        cookies.remove("phone");
        cookies.put("email", "jayy@gmail.com");

        System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
        System.out.println("Name: " + cookies.get("username"));
        System.out.println("Phone: " + cookies.get("phone"));

        System.out.println("ALL COOKIES: ");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));

        }
    }
}
