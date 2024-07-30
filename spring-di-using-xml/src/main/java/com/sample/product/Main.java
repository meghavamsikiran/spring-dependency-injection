package com.sample.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/product/product.xml");
		ProductServiceImpl my = (ProductServiceImpl) ctx.getBean("p1");
		ProductServiceImpl or = (ProductServiceImpl) ctx.getBean("p2");
		my.addRecord();
		or.addRecord();
	}
}
