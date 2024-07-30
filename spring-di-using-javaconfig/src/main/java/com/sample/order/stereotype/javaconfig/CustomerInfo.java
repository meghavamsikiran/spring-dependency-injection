package com.sample.order.stereotype.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class CustomerInfo {
	
	public void getCustomerDetails() {
		System.out.println("Customer details recieved...");
	}
}
