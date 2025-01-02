package com.example.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean Scope - Spring bean scope will control how many times a spring can be initiated in the container.
 - Default scope of any spring appln is singleton. i.e bean will created at the time of startup & will
   be reused throughout the appln context.
  Here we need not to specify the singleton scope.
 - Prototype scope - It will create the beans each time it requested.
 To check that we can print the reference of that bean.
 */
@Component
//@Scope("singleton")
@Scope("prototype")
public class PhonePayPaymentProcessor implements IPaymentProcessor{
    public void proceedPayment(Double amount){
        if (amount != 0){
            System.out.println("Payment of "+amount+"$ done successfully using Phone Pay.");
        }
        else
            throw new RuntimeException("Please enter the valid amount.");
    }
}
