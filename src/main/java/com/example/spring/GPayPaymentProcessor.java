package com.example.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * This is third way of creating the bean lifecycle hooks by creating init() & destroy() method in this class & using Java App
 * config class's beans.
*/
//@Component
public class GPayPaymentProcessor implements IPaymentProcessor{
    public void proceedPayment(Double amount){
        if (amount != 0){
            System.out.println("Payment of "+amount+"$ done successfully using Google Pay.");
            System.out.println("Congratulations!! You have received the Cashback.");
        }
        else
            throw new RuntimeException("Please enter the valid amount.");
    }

    public void init(){
        System.out.println("Inside init gpay class");
    }
    public void destroy(){
        System.out.println("inside destroy method gpay class");
    }
}

