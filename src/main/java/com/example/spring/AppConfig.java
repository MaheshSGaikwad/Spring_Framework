package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * ComponentScan:-
  - In the component scanning spring will automatically scan specified package in the project for the beans which need to be created
    in our application(i.e. classes annotated with @Component) & when it finds, it will gather them into its ApplicationContext.
  - By using the @Autowired it will inject the dependency automatically where ever it is needed.
 */
@ComponentScan(basePackages = "com.example.spring")
public class AppConfig {
//    /**
//     @Bean Annotation:
//     - The @Bean Annotation indicates that method instantiates,configure & initialize a new object to be managed by
//     Spring IOC Container.
//     - Basically it is similar to the <bean> </bean> in the XML config.
//     */
//    @Bean(name = "phonePay")
//    public PhonePayPaymentProcessor createPhonePayPaymentProcessor(){
//        return new PhonePayPaymentProcessor();
//    }
//
//    @Bean(name = "gPay")
//    public GPayPaymentProcessor createGPayPaymentProcessor(){
//        return new GPayPaymentProcessor();
//    }
//
//    @Bean(name = "shoppingCart")
//    public ShoppingCart createShoppingCart(){
//       // return new ShoppingCart(createGPayPaymentProcessor());
//        ShoppingCart cart = new ShoppingCart();
//        cart.setPaymentProcessor(createGPayPaymentProcessor());
//        return cart;
//    }
}
