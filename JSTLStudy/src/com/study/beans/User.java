package com.study.beans;

public class User {
	private String firstName;
	private String lastName;
	
	public User() {
		firstName = "Kitty";
		lastName = "Cat";
	}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String print(String sth) {
		return sth;
	}
	
}
