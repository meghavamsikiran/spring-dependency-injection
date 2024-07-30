package com.sample.order.stereotype.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class ProcessPayment {
	
	public void checkOut() {
		System.out.println("Payment processed...");
	}
}
