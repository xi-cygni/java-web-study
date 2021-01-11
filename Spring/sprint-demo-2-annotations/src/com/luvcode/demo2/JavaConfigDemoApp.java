package com.luvcode.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach theFootballCoach = context.getBean("footballCoach", Coach.class);
		SwimCoach theSwimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theTennisCoach.getDailyWorkout());
		System.out.println(theFootballCoach.getDailyWorkout());
		System.out.println(theTennisCoach.getDailyFortune());
		System.out.println(theTennisCoach.eatYourBananas());
		System.out.println(theTennisCoach.getRandomService());
		
		System.out.println(theSwimCoach.getRandomService());
		
		System.out.println("Email: " + theSwimCoach.getEmail());
		System.out.println("Team: " + theSwimCoach.getTeam());
		
		context.close();
	}
}
