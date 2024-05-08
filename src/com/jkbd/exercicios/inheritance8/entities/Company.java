package com.jkbd.exercicios.inheritance8.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double taxC;
        if (numberOfEmployees > 10) {
            taxC = getAnualIncome() * 0.14;
        } else {
            taxC = getAnualIncome() * 0.16;
        }
        return taxC;
    }
}

