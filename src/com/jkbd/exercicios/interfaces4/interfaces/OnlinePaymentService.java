package com.jkbd.exercicios.interfaces4.interfaces;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);


}
