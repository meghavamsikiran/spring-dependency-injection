package com.sample.order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = null;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PlaceOrder po = (PlaceOrder) ctx.getBean("po");
		System.out.println("\n===> Place Order");
		po.completeOrder();
	}
}
