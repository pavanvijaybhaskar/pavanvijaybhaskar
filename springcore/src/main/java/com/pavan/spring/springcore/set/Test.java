package com.pavan.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pavan/spring/springcore/set/car.xml");
		CarDealer obj=(CarDealer) context.getBean("car");
		System.out.println("Car Name:" + obj.getName());
		System.out.println("Car Models:" + obj.getModels());
	}

}
