package com.jkbd.exercicios.inheritance8.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double taxI;
        if (getAnualIncome() < 2000) {
            taxI = getAnualIncome() * 0.15;
        } else {
            taxI = getAnualIncome() * 0.25;
        }
        taxI = taxI - (getHealthExpenditures() * 0.5);
        if (taxI < 0.0) {
            taxI = 0.0;
        }
        return taxI;
    }
}
