package com.tka.ExamPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.tka.Entity")
public class ExamPortalApplication {

	public static void main(String[] args){
		SpringApplication.run(ExamPortalApplication.class, args);
	}

}
