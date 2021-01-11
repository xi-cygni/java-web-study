package com.luvcode.demo2;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice running for 40 mins with a ball";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eatYourBananas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRandomService() {
		// TODO Auto-generated method stub
		return null;
	}

}
