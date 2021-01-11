package com.luvcode.demo2;

import org.springframework.stereotype.Component;

@Component
public class BananaFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Eat bananas, they contain potassium!";
	}

}
