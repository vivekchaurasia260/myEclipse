package com.practice.vivekThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {
	
	@RequestMapping(value="/example")
	public String example() {
		
		return "example";
	}

}
