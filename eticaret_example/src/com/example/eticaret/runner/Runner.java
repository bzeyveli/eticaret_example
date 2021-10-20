package com.example.eticaret.runner;

import com.example.eticaret.business.Login;
import com.example.eticaret.business.ShoppingCart;
import com.example.eticaret.business.concrete.CrediCardPayment;
import com.example.eticaret.dao.DaoManager;
import com.example.eticaret.entity.Product;
import com.example.eticaret.entity.User;

public class Runner {
	public static void main(String[] args) {
		Product product = new Product("Cv123", 100);
		Product product1 = new Product("Cv456", 200);

		User user = new User("bekir", "zeyveli44@gmail.com");
		ShoppingCart shoppingCart = user.getShoppingCart();
		shoppingCart.productAdd(product);
		shoppingCart.productAdd(product1);

		shoppingCart.pay(new CrediCardPayment("bekir",123,456));

		
		Login login = new Login(new DaoManager());
		boolean result = login.loginControl("bekir","123");
		System.out.println("giriþ :"+result);
		
	}
}
