package com.jkbd.exercicios.interfaces4.service;

import com.jkbd.exercicios.interfaces4.entities.Contract;
import com.jkbd.exercicios.interfaces4.entities.Installment;
import com.jkbd.exercicios.interfaces4.interfaces.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));

    }
}
