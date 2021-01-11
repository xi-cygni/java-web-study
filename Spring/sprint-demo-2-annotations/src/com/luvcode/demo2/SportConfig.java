package com.luvcode.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luvcode.demo2") // scans componnent
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for our sad fortune xd
	@Bean 
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach( sadFortuneService() );
		
		return mySwimCoach;
	}

}
