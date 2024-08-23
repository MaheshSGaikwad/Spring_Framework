package com.example.spring;

public class ShoppingCart {

    /** Tight coupling:
     1.whenever we are creating the object of ShoppingCart class we are also creating the object of PhonePayPaymentProcessor class.
     In other words ,we can say that ShoppingCart class is highly dependent on the PhonePayPaymentProcessor class.
     2. In software development term, ShoppingCart class is tightly coupled with PhonePayPaymentProcessor class & having tightly coupled
     code is not good for appln.
     3. Tightly coupled code is not easy to maintain & test.
     eg. Suppose if we want to use the GPayPaymentProcessor instead of PhonePay, it will change the shoppingCart class as well.

     **/
    /*
    private PhonePayPaymentProcessor paymentProcessor;
    ShoppingCart(){
        this.paymentProcessor = new PhonePayPaymentProcessor();
    }
    void checkOut(Double amount){
        paymentProcessor.proceedPayment(amount);
    }
     */

    /** Loose coupling:
     The key to making the loosely coupled classes is to use the interface & its polymorphic behaviour.
     eg. so instead of creating the object of PhonePay class we can create the the IPaymentProcessor & implement it,so at the run time
     we can use any one of the processor of client choice.
     */
    private IPaymentProcessor paymentProcessor;
    ShoppingCart(IPaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    void checkOut(Double amount){
        paymentProcessor.proceedPayment(amount);
    }
}

