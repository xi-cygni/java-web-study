package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach myCoach2 = context.getBean("myCoach", Coach.class);
		
		boolean result = myCoach == myCoach2;
		
		System.out.println(result);
		
	}
}
