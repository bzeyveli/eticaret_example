package com.example.eticaret.business.concrete;

import com.example.eticaret.business.abstracts.ShoppingMethods;

public class CrediCardPayment implements ShoppingMethods {
	String isim;
	int kartNumaras�;
	int cvv;

	public CrediCardPayment(String isim, int kartNumaras�, int cvv) {
		this.isim = isim;
		this.kartNumaras� = kartNumaras�;
		this.cvv = cvv;
	}
	
	public void pay(double amount) {
		System.out.println("kredi kart� ile �deme ba�ar�l�..");
	}

}
