package com.example.eticaret.business;

import java.util.ArrayList;
import java.util.List;

import com.example.eticaret.business.abstracts.ShoppingMethods;
import com.example.eticaret.entity.Product;

public class ShoppingCart {

	List<Product> products = new ArrayList<Product>();
	
	
	public void productAdd(Product product){
		products.add(product);
	}
	
	public void productDelete(Product product){
		products.remove(product);
	}
	
	public double sumAmount(){
		double sum = 0;
		for (Product product: products) {
			sum+=product.getAmount();
		}
		return sum;
	}
	
	public void pay(ShoppingMethods shoppingMethods){
		shoppingMethods.pay(sumAmount());
	}
}
