package com.sample.product_vendor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = null;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Product p = (Product) ctx.getBean("p1");
		
		System.out.println(p.getProductId()+" : "+p.getProductName()+" || "+p.getV1().getVendorId()+" : "+p.getV1().getVendorName());
		ctx.close();
	}
}
