package com.luvcode.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// makes the class a bean class
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService") // if we have many FortuneService implementations
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("bananaFortuneService")
	private FortuneService bananaService;
	
	@Autowired
	@Qualifier("randomListService")
	private FortuneService randomService;
	
	public TennisCoach() {
		System.out.println("Inside tennis constructor");
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("Inside Start()");
	}
	
	@PreDestroy
	public void End() {
		System.out.println("In pre-restroy: " + getRandomService());
		System.out.println("Inside End()");
	}
	
	
	/* configuring dependency injection, spring scans for component that implements
	FortuneService interface */
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	/* define a setter
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setter");
		fortuneService = theFortuneService;
	}*/
	
	/* a method
	@Autowired
	public void dumbMethod(FortuneService theFortuneService) {
		System.out.println("Inside method");
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Prctive your backend";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String eatYourBananas() {
		return bananaService.getFortune();
	}

	@Override
	public String getRandomService() {
		return randomService.getFortune();
	}

}
