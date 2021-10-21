package com.example.eticaret.business.concrete;

import com.example.eticaret.business.abstracts.ShoppingMethodsHelper;

public class PayPalPayment implements ShoppingMethodsHelper{
	String email;
	String password;
		
	public PayPalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public void pay(double amount) {
		System.out.println("payPal ile ödeme baþarýlý");
	}

}
