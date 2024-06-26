package com.jkbd.generics.tipocoringa.application;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Jayanne", "Josué", "Jacson");
        printList(myStr);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);

        }
    }
}
