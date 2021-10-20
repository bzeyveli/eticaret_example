package com.example.eticaret.entity;

public class Product {
	
	public Product(String serialNumber, double amount) {
		this.serialNumber = serialNumber;
		this.amount = amount;
	}

	private String serialNumber;
	private double amount;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
