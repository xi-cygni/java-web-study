package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {

	public static void main(String[] args) {
		
		// starts the bean
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanLifecycleApplicationContext.xml");

		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		//For "prototype" scoped beans, Spring does not call the destroy method.  Gasp!  
		// ends the bean
		context.close();
		
	}
}
