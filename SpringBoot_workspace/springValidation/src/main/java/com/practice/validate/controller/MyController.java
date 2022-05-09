package com.practice.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.validate.entities.LoginData;

@Controller
public class MyController {
	
	@RequestMapping(value= "/form",method=RequestMethod.GET)
	public String openForm(Model model) {
		System.out.println("Inside form method");
		
		model.addAttribute("loginData", new LoginData());
		
		return "form";
	}
	
	// handler for processing form
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult res) {
		
		if(res.hasErrors()) {
			System.out.println(res);
			
			return "form";
		}
		
		System.out.println(loginData);
		
		return "success";
	}
	

}
