package com.tka.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Result;

@RestController
@CrossOrigin("http://localhost:4200")
public class ResultController {

	@Autowired
	SessionFactory factory;
	
	@PostMapping("setResult")
	public boolean getResult(@RequestBody Result result)
	{
		Session session=factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(result);
		
		tx.commit();
	
		return true;
	}
}
