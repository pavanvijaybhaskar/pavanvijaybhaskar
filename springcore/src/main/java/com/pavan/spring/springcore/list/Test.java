package com.pavan.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pavan/spring/springcore/list/hospital.xml");
		Hospital obj=(Hospital) context.getBean("hospital");
		System.out.println("Hospital Name:" + obj.getName());
		System.out.println("Hospital Departments:" + obj.getDepartments());
	}

}
