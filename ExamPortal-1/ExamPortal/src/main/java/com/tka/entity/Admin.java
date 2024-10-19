package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
@Id
String username;
String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "Admin [username=" + username + ", password=" + password + "]";
}

@Override
public boolean equals(Object secondobject) 
{
	System.out.println("equals from Admin class");
	
	Admin admin=(Admin)secondobject;
	
	if(this.username.equals(admin.username) && this.password.equals(admin.password))
		
		return true;
	else
		return false;
}

}
