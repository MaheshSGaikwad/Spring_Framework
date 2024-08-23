package com.example.spring;
public class ShoppingCartApplication {
	public static void main(String[] args) {
		 /*
        ShoppingCart cart = new ShoppingCart();
        cart.checkOut(10.10);
         */

		/**
		 By making the loosely coupled code, we can choose the whichever payment processor as per client requirement.
		 */
		ShoppingCart cart1 = new ShoppingCart(new PhonePayPaymentProcessor());
		cart1.checkOut(10.10);
		System.out.println();

		ShoppingCart cart2 = new ShoppingCart(new GPayPaymentProcessor());
		cart2.checkOut(10.10);
	}

}
