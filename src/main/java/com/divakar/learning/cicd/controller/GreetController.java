package com.divakar.learning.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	
	@GetMapping
	public String GreetUser()
	{
		return "Welcome to CICD learning demo";
	}
	
}
