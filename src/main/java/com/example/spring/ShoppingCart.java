package com.example.spring;

public class ShoppingCart {
    /**
     - Dependency Injection is specific implementation of IOC principle. It is technique used to inject the dependencies of a class
     into class itself rather than class creating its dependency.
     - There are mainly two ways of DI:
     1. Constructor Injection
     2. Setter Injection
     */
    private IPaymentProcessor paymentProcessor;

    /**
     * This is example of constructor injection which involves providing the dependencies through constructor of the class.
     * @param paymentProcessor
     */
    ShoppingCart(IPaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    void checkOut(Double amount){
        paymentProcessor.proceedPayment(amount);
    }
}

