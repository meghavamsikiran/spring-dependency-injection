package com.sample.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/order/order.xml");
		PlaceOrder obj1 = (PlaceOrder) ctx.getBean("po");
		obj1.completeOrder();
		
		System.out.println("\n===> Using autowire='byType' in usingautowire.xml");
		ApplicationContext newctx = new ClassPathXmlApplicationContext("classpath:com/sample/order/usingautowire.xml");
		PlaceOrder obj2 = (PlaceOrder) newctx.getBean("po");
		obj2.completeOrder();
	}
}
