package com.example.eticaret.entity;

import com.example.eticaret.business.ShoppingCart;

public class User {

	String id;
	String password;
	String email;

	private ShoppingCart shoppingCart;

	public User(String password, String email) {
		this.password = password;
		this.email = email;
		this.shoppingCart = new ShoppingCart();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
