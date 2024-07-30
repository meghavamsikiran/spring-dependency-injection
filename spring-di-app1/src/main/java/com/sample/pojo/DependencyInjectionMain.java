package com.sample.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/pojo/product-vendor.xml");
		Product p = (Product) ctx.getBean("p1");
		System.out.println(p.getProductId()+" : "+p.getProductName()+" : "+p.getV1().getVendorId()+" : "+p.getV1().getVendorName());
	}
}
