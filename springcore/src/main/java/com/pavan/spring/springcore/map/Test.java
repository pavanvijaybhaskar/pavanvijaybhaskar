package com.pavan.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pavan/spring/springcore/map/customer.xml");
		Customer customer=(Customer) context.getBean("customer");
		System.out.println(customer);
	}
	

}
