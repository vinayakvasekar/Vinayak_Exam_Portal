package com.tka.entity;

public class Reset {
	
	String username;
	String password1;
	String password2;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	@Override
	public String toString() {
		return "Reset [username=" + username + ", password1=" + password1 + ", password2=" + password2 + "]";
	}
	
	
	
	
	
	
	

}
