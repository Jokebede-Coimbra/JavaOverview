package com.jkbd.exercicios.inheritance4.application;

import com.jkbd.exercicios.inheritance4.entities.Employee;
import com.jkbd.exercicios.inheritance4.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Employee #" + i + " data: ");
            System.out.println("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = sc.nextInt();
            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                // Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                // employeeList.add(emp);
                employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                // Employee emp = new Employee(name, hours, valuePerHour);
                // employeeList.add(emp)
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : employeeList) {

            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();

    }
}
