package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class UserController {
	
	@RequestMapping(path="/prc", method=RequestMethod.GET)
	public String home() {
		System.out.println("Home Practice...");
		
		return "home";
	}
	
	@RequestMapping("/floor")
	public String totalFloor() {
		System.out.println("Inside total floor");
		return "1";
	}
	
	

}
