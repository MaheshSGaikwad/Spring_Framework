package com.example.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
1. @Component annotation indicates that an annotated class is a "spring bean/component".
 It tells spring container to automatically create spring bean.
2. @Primary annotation is used when there are multiple components of same types are present for the autowiring,so to
  define which component to be used we use the primary annotation.
 eg. As the IPaymentProcessor is interface having the two of the component GPay & PhonePay , so make the GPay for the autowiring, we use this annotation.
 */
@Component
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

