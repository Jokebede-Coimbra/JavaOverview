package com.jkbd.interfaces.solucaoproblema.services;

import com.jkbd.interfaces.solucaoproblema.interfaces.TaxService;

public class BrazilTaxService implements TaxService {

    @Override
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
