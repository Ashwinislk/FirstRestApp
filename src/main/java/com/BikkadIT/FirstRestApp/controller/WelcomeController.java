package com.BikkadIT.FirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/WelcomeController")
public class WelcomeController {
	
	@GetMapping("/wel")
	public String welcome() {
		String msg="Welcome to BikkadIT";
		
		return msg;
		
	}
	

	@GetMapping("/wel1")
	public String welcome1() {
		String msg="Welcome to Class";
		
		return msg;
		
	}

}
