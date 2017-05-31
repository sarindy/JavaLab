package com.sarindy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarindy.PersonModel;

@RestController
public class DefaultController {
	
	@Autowired
	private PersonModel personModel;
	
	@RequestMapping(value="/")
	public String helloWorld(){
		return "Hello World!!";
	}
	
	@RequestMapping(value="/person")
	public String getPerson(){
		personModel.setFirstName("Sarindy");
		personModel.setLastName("Ouk");
		return personModel.toString();
	}

}
