package com.example.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PhonePayPaymentProcessor implements IPaymentProcessor{
    public void proceedPayment(Double amount){
        if (amount != 0){
            System.out.println("Payment of "+amount+"$ done successfully using Phone Pay.");
        }
        else
            throw new RuntimeException("Please enter the valid amount.");
    }
}
