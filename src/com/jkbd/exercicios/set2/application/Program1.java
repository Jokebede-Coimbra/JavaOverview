package com.jkbd.exercicios.set2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A? ");
        int numA = sc.nextInt();

        for (int i = 1; i <= numA; i++) {
            int courseA = sc.nextInt();
            a.add(courseA);
        }

        System.out.println("How many students for course B? ");
        int numB = sc.nextInt();

        for (int i = 1; i <= numB; i++) {
            int courseB = sc.nextInt();
            b.add(courseB);
        }

        System.out.println("How many students for course C? ");
        int numC = sc.nextInt();

        for (int i = 1; i <= numC; i++) {
            int courseC = sc.nextInt();
            c.add(courseC);
        }

        Set<Integer> allCourses = new HashSet<>();
        allCourses.addAll(a);
        allCourses.addAll(b);
        allCourses.addAll(c);
        System.out.println("Total users:  " + allCourses.size());


        sc.close();
    }
}
