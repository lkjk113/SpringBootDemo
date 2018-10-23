package com.iss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/Greeting")
	public String Greeting() {
		return "Hello!";
	}
	
	@RequestMapping("/Hello")
	public String Hello() {
		return "Hi!";
	}
}

