package com.basepackage.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SignupController {

	
	
	
	@PostMapping("/signup")
	public  String    registerUser() {
		
		
		return "Hello from springboot";
	}
}
