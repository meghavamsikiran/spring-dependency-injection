package com.sample.order;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean
	public CartInfo cartInfo() {
		return new CartInfo();
	}
	
	@Bean
	public CustomerInfo customerInfo() {
		return new CustomerInfo();
	}
	
	public Inventory inventory() {
		return new Inventory();
	}
	
	@Bean
	public NotificationSender notificationSender() {
		return new NotificationSender();
	}
	
	@Bean
	public ProcessPayment processPayment() {
		return new ProcessPayment();
	}
	
	@Bean
	public PlaceOrder po() {
		PlaceOrder po = new PlaceOrder();
		po.setCartInfo(cartInfo());
		po.setCustomerInfo(customerInfo());
		po.setInventory(inventory());
		po.setNotificationSender(notificationSender());
		po.setProcessPayment(processPayment());
		return po;
	}
}
