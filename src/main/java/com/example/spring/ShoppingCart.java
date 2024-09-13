package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    private IPaymentProcessor paymentProcessor;

    ShoppingCart(){
    }

    public IPaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    /**
     Qualifier:-
     Qualifier is used to avoid the ambiguity of injecting the beans when spring finds multiple beans of same type
     eg. In our case we have two of the beans phonePay & gPay ,so to avoid the ambiguity for injection, we used the Qualifier
     to the phonePayProcessor.
     Earlier we used the primary annotation to do the same job.
     */
    @Autowired
    public void setPaymentProcessor(@Qualifier("phonePayPaymentProcessor") IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    void checkOut(Double amount){
        paymentProcessor.proceedPayment(amount);
    }
}

