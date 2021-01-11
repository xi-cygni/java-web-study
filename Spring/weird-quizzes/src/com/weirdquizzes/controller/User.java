package com.weirdquizzes.controller;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String login;
	private String password;
	
	private String firstName;
	private String city; 
	private int age;
	private Gender gender; 
	
	List<Integer> ageOptions = new ArrayList<>();
	
	public User() {
		setAgeOptions();
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Integer> getAgeOptions() {
		return ageOptions;
	}

	private void setAgeOptions() {
		for(Integer i = 1; i < 101; i++)
			ageOptions.add(i);
	}
}
