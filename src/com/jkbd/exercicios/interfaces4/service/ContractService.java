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
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueData = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);

            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueData, quota));

        }

    }
}
