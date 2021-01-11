package org.study.entity;

public class User {
	private int id_users;
	private String username;
	private String email;
	
	public User(int id_users, String username, String email) {
		this.id_users = id_users;
		this.username = username;
		this.email = email;
	}
	
	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
	public int getId_users() {
		return id_users;
	}
	public void setId_users(int id_users) {
		this.id_users = id_users;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
