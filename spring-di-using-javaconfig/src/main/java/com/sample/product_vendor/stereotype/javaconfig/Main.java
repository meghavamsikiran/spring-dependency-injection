package com.sample.product_vendor.stereotype.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
        Product p = ctx.getBean(Product.class);
        System.out.println(p.getProductId()+" : "+p.getProductName()+" || "+p.getV1().getVendorId()+" : "+p.getV1().getVendorName());
    }
}
