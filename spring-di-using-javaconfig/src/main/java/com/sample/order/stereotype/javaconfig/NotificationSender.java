package com.sample.order.stereotype.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class NotificationSender {
	
	public void sendNotification() {
		System.out.println("Order placed successfully...");
	}
}
