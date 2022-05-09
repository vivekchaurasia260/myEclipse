package com.smartmanager.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartmanager.entities.Contact;
import com.smartmanager.entities.Users;
import com.smartmanager.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	//method for adding common data to response
	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		
		String userName = principal.getName();
		
		System.out.println("USERNAME " + userName);
		
		Users user = this.userRepository.getUserByUserName(userName);
		
		System.out.println("USER " + user);
		
		model.addAttribute("user", user);
	}
	
	// dashboard home
	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal) {

		model.addAttribute("title", "User Dashboard");
		
		return "normal/user_dashboard";
	}
	
	// open add form handler
	@RequestMapping("/add_contact")
	public String openAddContactForm(Model model) {
		
		model.addAttribute("title", "Add Contact");
		
		model.addAttribute("contact", new Contact());
		
		return "normal/add_contact_form";
	}
	
}
