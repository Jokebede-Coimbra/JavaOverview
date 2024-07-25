package com.jkbd.programacaofuncionalexpressoeslambda.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray())); // [3, 4, 5, 10, 7]

        Stream<Integer> st2 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st2.toArray())); // [30, 40, 50, 100, 70]

        Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st3.toArray())); // [Maria, Alex, Bob]

        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st4.limit(10).toArray())); // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

        Stream<Long> st5 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]})
                .map(p -> p[0]);
        System.out.println(Arrays.toString(st5.limit(10).toArray())); // Fibonacci > [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }
}
