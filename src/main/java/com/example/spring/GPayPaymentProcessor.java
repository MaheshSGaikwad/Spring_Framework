package com.example.spring;

public class GPayPaymentProcessor implements IPaymentProcessor{
    public void proceedPayment(Double amount){
        if (amount != 0){
            System.out.println("Payment of "+amount+"$ done successfully using Google Pay.");
            System.out.println("Congratulations!! You have received the Cashback.");
        }
        else
            throw new RuntimeException("Please enter the valid amount.");
    }
}

