package com.tka.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.User;

@RestController
@CrossOrigin("http://localhost:4200")
public class ForgetPasswordController {

	@Autowired
	SessionFactory factory;
	
	@GetMapping("forgetPassword/{username}")
	public boolean forgetPassword(@PathVariable String username)
	{
		try
		{
			Session session=factory.openSession();
			User user=session.get(User.class,username);
			if(user==null)
			{
				return false;
			}
			return true;
		}
		
		catch(Exception e)
		{
			return false;
		}

	}
}
