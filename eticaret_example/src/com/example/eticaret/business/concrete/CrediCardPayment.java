package com.example.eticaret.business.concrete;

import com.example.eticaret.business.abstracts.ShoppingMethods;

public class CrediCardPayment implements ShoppingMethods {
	String isim;
	int kartNumarasý;
	int cvv;

	public CrediCardPayment(String isim, int kartNumarasý, int cvv) {
		this.isim = isim;
		this.kartNumarasý = kartNumarasý;
		this.cvv = cvv;
	}
	
	public void pay(double amount) {
		System.out.println("kredi kartý ile ödeme baþarýlý..");
	}

}
