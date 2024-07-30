package com.sample.order.stereotype.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class CartInfo {
	
	public void getItemsFromCart() {
		System.out.println("Cart Items recieved...");
	}
}
