package com.infiniteskills.mvc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infiniteskills.mvc.service.AlbumService;

@Controller
public class HomeController {
	
	private static final Logger log = LogManager.getLogger(HomeController.class);
	
	
	@Autowired
	AlbumService albumService;
	
	@ModelAttribute(value="myDate")
	public Date newDate() {
		return new Date();
	}

	@RequestMapping("/home")
	public String goHome() {
		log.info("Home Controller Invoked.");
		albumService.saveAlbum();
		return "home";
	}
	
	@RequestMapping("/friends")
	public String getNumbers(Model model) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("John", "George", "Mathew", "Anoop", "Midhun", "Sanju"));
		model.addAttribute("names", names);
		
		return "home";
	}
}
