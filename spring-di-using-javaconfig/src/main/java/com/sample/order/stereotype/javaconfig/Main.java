package com.sample.order.stereotype.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PlaceOrder o = ctx.getBean(PlaceOrder.class);
		o.completeOrder();
		
	}
}
