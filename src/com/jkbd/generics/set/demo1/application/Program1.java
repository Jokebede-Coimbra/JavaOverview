package com.jkbd.generics.set.demo1.application;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.contains("T"));

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }


    }
}
