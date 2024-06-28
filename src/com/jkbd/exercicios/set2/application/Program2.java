package com.jkbd.exercicios.set2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = readStudentData(sc, "A");
        Set<Integer> courseB = readStudentData(sc, "B");
        Set<Integer> courseC = readStudentData(sc, "C");

        Set<Integer> allCourses = new HashSet<>();
        allCourses.addAll(courseA);
        allCourses.addAll(courseB);
        allCourses.addAll(courseC);

        System.out.println("Total users: " + allCourses.size());

        sc.close();
    }

    private static Set<Integer> readStudentData(Scanner sc, String courseName) {
        Set<Integer> students = new HashSet<>();
        System.out.print("How many students for course " + courseName + "? ");
        int numStudents = sc.nextInt();

        System.out.println("Enter the student IDs for course " + courseName + ":");
        for (int i = 1; i <= numStudents; i++) {
            int studentID = sc.nextInt();
            students.add(studentID);
        }

        return students;
    }
}



