package com.jkbd.interfaces.metodosdefault.service;

import com.jkbd.interfaces.metodosdefault.interfaces.InterestService;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
