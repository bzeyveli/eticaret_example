package com.example.eticaret.business.concrete;

import com.example.eticaret.business.abstracts.ShoppingMethods;

public class SmsPayment implements ShoppingMethods{

	public void pay(double pay) {
		System.out.println("Sms ile ödeme baþarýlý...");
	}

}
