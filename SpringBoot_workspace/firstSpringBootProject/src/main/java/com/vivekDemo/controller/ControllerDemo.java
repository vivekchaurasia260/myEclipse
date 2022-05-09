package com.vivekDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is contact");
		return "contact";
	}

}
