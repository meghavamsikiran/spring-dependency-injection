package com.sample.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =null;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductServiceImpl ps = (ProductServiceImpl) ctx.getBean("ps");
		ps.addRecord();
		ctx.close();
	}
}
