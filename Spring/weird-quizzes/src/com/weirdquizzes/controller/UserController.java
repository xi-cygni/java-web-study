package com.weirdquizzes.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/showLoginForm")
	public String showLoginForm(Model model) {
		
		User logUser = new User(); 
		model.addAttribute("user", logUser);
		
		return "login-form";
	}
	
	@RequestMapping("/processLoginForm") 
	public String processLoginForm(@ModelAttribute("user") User logUser) {
		return "submit-login";
	}
	
	@RequestMapping("/showProfileForm")
	public String showUserForm(Model model) {
		
		User logUser = new User(); 
		model.addAttribute("user", logUser);
		model.addAttribute ("gender", Gender.values());
		
		return "profile-data-form";
	}
}
