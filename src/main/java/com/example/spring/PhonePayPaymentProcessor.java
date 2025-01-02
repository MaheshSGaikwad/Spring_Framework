package com.example.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 *  We can read the external file by defining that into application.properties file & using the PropertySource & Value annotations.
 */
@Component
@PropertySource(value = "classpath:/application.properties")
public class PhonePayPaymentProcessor implements IPaymentProcessor{
    @Value("${app.database.url}")
    private String databaseUrl;
    public void proceedPayment(Double amount){
        if (amount != 0){
            System.out.println("Payment of "+amount+"$ done successfully using Phone Pay.");
            System.out.println(databaseUrl);
        }
        else
            throw new RuntimeException("Please enter the valid amount.");
    }
}
