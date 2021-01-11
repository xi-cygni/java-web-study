package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {
				"Today is wednesday, be happy",
				"You can do it!",
				"You are powerful!"
		};
		
		Random number = new Random();
		
		return fortunes[number.nextInt(fortunes.length)];
	}

}
