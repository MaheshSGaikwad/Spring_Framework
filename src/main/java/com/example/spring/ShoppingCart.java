package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    /**
     - Dependency Injection is specific implementation of IOC principle. It is technique used to inject the dependencies of a class
     into class itself rather than class creating its dependency.
     - There are mainly two ways of DI:
     1. Constructor Injection
     2. Setter Injection
     */
    private IPaymentProcessor paymentProcessor;

    ShoppingCart(){
    }

    public IPaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    /**
      Autowiring:
      - Spring framework enable the automatic dependency injection using the @Autowired annotation'
      To automatically wire the beans, we need to use the @ComponentScan with specified base package & @Component class for the classes.
     */
    @Autowired
    public void setPaymentProcessor(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    void checkOut(Double amount){
        paymentProcessor.proceedPayment(amount);
    }
}

