package com.example.eticaret.business.concrete;

import com.example.eticaret.business.abstracts.ShoppingMethodsHelper;

public class SmsPayment implements ShoppingMethodsHelper{

	public void pay(double pay) {
		System.out.println("Sms ile ödeme baþarýlý...");
	}

}
