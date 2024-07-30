package com.sample.order.stereotype.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Inventory {
	
	public void updateInventory() {
		System.out.println("Inventory updated successfully...");
	}
}
