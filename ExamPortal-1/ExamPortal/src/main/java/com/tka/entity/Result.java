package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Result {

	
@Id
String username;

String subject;
int marks;


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

@Override
public String toString() {
	return "Result [username=" + username + ", subject=" + subject + ", marks=" + marks + "]";
}


}
