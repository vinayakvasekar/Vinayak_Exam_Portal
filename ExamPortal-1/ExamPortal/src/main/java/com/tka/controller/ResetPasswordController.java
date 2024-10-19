package com.tka.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Reset;
import com.tka.entity.User;

@RestController
@CrossOrigin("http://localhost:4200")
public class ResetPasswordController {
	
	

		
	

	@Autowired
	SessionFactory factory;
	
	@PostMapping("resetPassword")
	public boolean resetPassword(@RequestBody Reset reset)
	{
		System.out.println(" data from client is " + reset);
		
		try
		{
			Session session=factory.openSession();
			String s1=reset.getPassword1();
			String s2=reset.getPassword2();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(reset.getUsername());
			if(s1.equals(s2))
			{
				System.out.println("true");
				User user=session.get(User.class,reset.getUsername());
				user.setPassword(reset.getPassword1());
				return true;
			}
			else
			{
				System.out.println("false");
				return false;
			}
			
		
		}
		
		catch(Exception e)
		{
			return false;
		}

	}

}
