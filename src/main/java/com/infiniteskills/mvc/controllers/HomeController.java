package com.infiniteskills.mvc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@ModelAttribute(value="myDate")
	public Date newDate() {
		return new Date();
	}

	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}
	
	@RequestMapping("/friends")
	public String getNumbers(Model model) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("John", "George", "Mathew", "Anoop", "Midhun", "Sanju"));
		model.addAttribute("names", names);
		
		return "home";
	}
}
