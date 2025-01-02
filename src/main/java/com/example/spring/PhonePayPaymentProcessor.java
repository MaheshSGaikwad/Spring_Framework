package com.example.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 Bean Lifecycle- beans lifecycle involves the initialization ,bean usage & destruction.
 We can perform it using 3 way
 1. InitializingBean, DisposableBean
  - By implementing these two methods & overriding the afterPropertiesSet() & destroy() method we can achieve the bean lifecycle.
  - in order to show the implementation of both the method we have to call the registerShutdownHook().
 Note- prototype scope will not manage the destruction of beans,so whenever we call the registerShutdownHook() method
    it will just give the implementation of afterProperties() but not destroy()
 */
@Component
//@Scope("singleton")
@Scope("prototype")
public class PhonePayPaymentProcessor implements IPaymentProcessor, InitializingBean, DisposableBean {
    public void proceedPayment(Double amount){
        if (amount != 0){
            System.out.println("Payment of "+amount+"$ done successfully using Phone Pay.");
        }
        else
            throw new RuntimeException("Please enter the valid amount.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed properties");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting properties after Bean is initialized");
    }
}
