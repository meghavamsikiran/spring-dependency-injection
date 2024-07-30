package com.sample.product_vendor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

public class AppConfig {
	
	@Bean
	public Vendor v1() {
		return new Vendor(101, "Vendor-1");
	}
	
	@Bean
	public Product p1() {
		Product p1 = new Product();
		p1.setProductId(777);
		p1.setProductName("Product-1");
		p1.setV1(v1());
		return p1;
	}
}
