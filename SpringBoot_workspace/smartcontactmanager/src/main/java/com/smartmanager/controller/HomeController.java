package com.smartmanager.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartmanager.entities.Users;
import com.smartmanager.helper.Message;
import com.smartmanager.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title", "Home - Smart Contact Manager");
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title", "About - Smart Contact Manager");
		
		return "about";
	}
	
	// this is for signup page request
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "Register - Smart Contact Manager");
		
		model.addAttribute("user", new Users());
		
		return "signup";
	}
	
	// handler for register user
	
	@RequestMapping(value = "/do_register",method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") Users user,BindingResult result1, @RequestParam(value="agreement",defaultValue="false") boolean agreement, Model model, HttpSession session) {
		
		try {
			
			if(!agreement) {
				System.out.println("You have not agreed the terms and conditions");
				
				throw new Exception("You have not agreed the terms and conditions");
			}
			
			if(result1.hasErrors()) {
				
				System.out.println("ERROR " + result1.toString());
				model.addAttribute("user",user);
				
				return "signup";
			}
			
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setImageURL("default.png");
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			System.out.println("Agreement " +agreement);
			System.out.println("User " +user);
			
			Users result = this.userRepository.save(user);
			
			model.addAttribute("user", new Users());
			
			session.setAttribute("message", new Message("Successfully Registered !!", "alert-success"));
			
			return "signup";
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("Something went wrong " + exc.getMessage(), "alert-danger"));
			
			return "signup";
		}
		
		
	}
	
	// handler for custom login
	
	@RequestMapping(value="/signin", method=RequestMethod.GET)
	public String customLogin(Model model) {
		
		model.addAttribute("title", "Login Page");
		
		return "login";
	}
	

}
	

