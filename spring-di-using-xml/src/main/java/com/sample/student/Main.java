package com.sample.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/student/student.xml");
		StudentServiceImpl my = (StudentServiceImpl) ctx.getBean("p1");
		my.addRecord();
	}
}
