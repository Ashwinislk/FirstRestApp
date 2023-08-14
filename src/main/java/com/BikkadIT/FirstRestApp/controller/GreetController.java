package com.BikkadIT.FirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/GreetController")
public class GreetController {
	@GetMapping("/greet")
	public String greet() {
		String msg="Good Morning";
		
		return msg;
		
	}

}
