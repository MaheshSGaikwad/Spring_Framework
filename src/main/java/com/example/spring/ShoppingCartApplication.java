package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingCartApplication {
	public static void main(String[] args) {
		System.out.println("Setter Injection Using the xml config:");
		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring.xml");
		ShoppingCart cart = xmlContext.getBean("shoppingCart", ShoppingCart.class);
		cart.checkOut(10.5);
		System.out.println();

		System.out.println("Setter Injection Using the Java config:");
		ApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ShoppingCart shoppingCart = javaConfigContext.getBean("shoppingCart", ShoppingCart.class);
		shoppingCart.checkOut(10.5);
	}

}
