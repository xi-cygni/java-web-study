package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "Hehe " + fortuneService.getFortune();
	}
	
	// add init method
	public void myStartupStuff() {
		System.out.println("Start coach!");
	}
	
	// add destroy method
	public void myDestroyStuff() {
		System.out.println("End coach!");
	}
}
