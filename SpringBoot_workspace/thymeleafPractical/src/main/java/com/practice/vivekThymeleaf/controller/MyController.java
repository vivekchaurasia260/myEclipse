package com.practice.vivekThymeleaf.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Inside about handler....");
		
		//Putting data in model...		
		model.addAttribute("name", "Vivek Chaurasia");
		model.addAttribute("currentDate", new Date().toLocaleString());
		
		return "about";
		// about.html
	}
	
	//handling iteration
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		
		List<String> names = List.of("Ankit", "Laxmi", "John" ,"Karan");
		
		model.addAttribute("names", names);
		// sending the arr..
		return "iterate";
	}
	
	// handler for conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model model) {
		
		System.out.println("conditional handler executed..");
		
		model.addAttribute("isActive", false);
		
		model.addAttribute("gender", "M");
		
		List<Integer> list = List.of(23);
		
		model.addAttribute("myList", list);
		
		return "condition";
	}
	
	//handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model model) {
		
		model.addAttribute("title", "I like to eat chola-bathura");
		
		model.addAttribute("subtitle", LocalDateTime.now().toString());
		
		return "service";
	}
	
	// for new about page
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutNew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		
		return "contact";
	}
	
	
}
