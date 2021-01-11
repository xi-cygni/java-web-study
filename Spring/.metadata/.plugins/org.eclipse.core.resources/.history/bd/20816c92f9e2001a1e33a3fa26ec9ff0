package com.luvcode.demo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomListService implements FortuneService {

	@Override
	public String getFortune() {
		
		List<String> fortunes;
		
		try {
			
			fortunes = Files.readAllLines(Paths.get("src\\randomFortunes.txt"));
			Random number =  new Random();
			int index = number.nextInt(fortunes.size());
			
			return fortunes.get(index);
			
		} catch(IOException e) { e.printStackTrace(); }
		
		return null;
	}

}
