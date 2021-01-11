package com.weirdquizzes.controller;

public enum Gender {
	MALE("male"), FEMALE("female"), OTHER("other");
	
	private String gender;
	
	private Gender(String gender) {
		this.gender = gender;
	}
	
	@Override
    public String toString(){
        return gender;
    }
}
