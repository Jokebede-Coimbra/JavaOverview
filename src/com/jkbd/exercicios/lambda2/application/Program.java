package com.jkbd.exercicios.lambda2.application;

import com.jkbd.exercicios.lambda2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Enter salary: ");
            double valor = sc.nextDouble();

            List<String> emails = getEmailsOfEmployeesWithSalaryAbove(list, valor);
            printEmails(emails, valor);

            double sum = getSumOfSalariesOfEmployeesWithNameStartingWith(list, "M");
            printSumOfSalaries(sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

    private static double getSumOfSalariesOfEmployeesWithNameStartingWith(List<Employee> employees, String prefix) {
        return employees.stream()
                .filter(e -> e.getNome().startsWith(prefix))
                .mapToDouble(Employee::getSalario)
                .sum();

    }

    private static List<String> getEmailsOfEmployeesWithSalaryAbove(List<Employee> employees, double salary) {
        Comparator<String> comparator = Comparator.comparing(String::toUpperCase);
        return employees
                .stream()
                .filter(e -> e.getSalario() > salary)
                .map(Employee::getEmail)
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private static void printEmails(List<String> emails, double salaryThreshold) {
        System.out.println("Email of people whose salary is more than " + salaryThreshold + ":");
        emails.forEach(System.out::println);
    }

    private static void printSumOfSalaries(double sum) {
        System.out.println("Sum of salary of people whose name starts with 'M':");
        System.out.printf("%.2f%n", sum);
    }

}
