package com.sample.product_vendor.stereotype.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/product_vendor/stereotype/usingxml/product-vendor.xml");
        
        Product p = ctx.getBean(Product.class);
        System.out.println(p.getProductId()+" : "+p.getProductName()+" || "+p.getV1().getVendorId()+" : "+p.getV1().getVendorName());
    }
}
