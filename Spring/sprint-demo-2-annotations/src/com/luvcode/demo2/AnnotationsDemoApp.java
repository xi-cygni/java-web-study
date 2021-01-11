package com.luvcode.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach theFootballCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println(theTennisCoach.getDailyWorkout());
		System.out.println(theFootballCoach.getDailyWorkout());
		System.out.println(theTennisCoach.getDailyFortune());
		System.out.println(theTennisCoach.eatYourBananas());
		System.out.println(theTennisCoach.getRandomService());
		
		context.close();
	}
}
