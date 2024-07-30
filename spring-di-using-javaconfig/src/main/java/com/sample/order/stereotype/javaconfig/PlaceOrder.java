package com.sample.order.stereotype.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceOrder {
	
	@Autowired
	private ProcessPayment processPayment;
	@Autowired
	private CustomerInfo customerInfo;
	@Autowired
	private CartInfo cartInfo;
	@Autowired
	private Inventory inventory;
	@Autowired
	private NotificationSender notificationSender;
	
	public void completeOrder() {
		processPayment.checkOut();
		customerInfo.getCustomerDetails();
		cartInfo.getItemsFromCart();
		inventory.updateInventory();
		notificationSender.sendNotification();
	}

	public ProcessPayment getProcessPayment() {
		return processPayment;
	}



	public void setProcessPayment(ProcessPayment processPayment) {
		System.out.println("> setProcessPayment method called...");
		this.processPayment = processPayment;
	}



	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		System.out.println("> setCustomerInfo() method called...");
		this.customerInfo = customerInfo;
	}

	public CartInfo getCartInfo() {
		return cartInfo;
	}

	public void setCartInfo(CartInfo cartInfo) {
		System.out.println("> setCartInfo() method called...");
		this.cartInfo = cartInfo;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		System.out.println("> setInventory() mehtod called...");
		this.inventory = inventory;
	}

	public NotificationSender getNotificationSender() {
		return notificationSender;
	}

	public void setNotificationSender(NotificationSender notificationSender) {
		System.out.println("> setNotificationSender() mehtod called...");
		this.notificationSender = notificationSender;
	}
}
