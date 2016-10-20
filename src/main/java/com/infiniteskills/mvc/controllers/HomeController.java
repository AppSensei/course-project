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

import com.infiniteskills.mvc.model.Artist;
import com.infiniteskills.mvc.model.Project;
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
		return "home";
	}
	
	@RequestMapping("/friends")
	public String displayFriendsInMemory(Model model) {
		
		List<Artist> names = new ArrayList<Artist>();
		
		Artist artistOne = new Artist();
		
		artistOne.setArtistId(1);
		artistOne.setName("John");
		
		Artist artistTwo = new Artist();
		artistTwo.setArtistId(2);
		artistTwo.setName("Sanju");
		
		Artist artistThree = new Artist();
		artistThree.setArtistId(3);
		artistThree.setName("Jason");
		
		Artist artistFour = new Artist();
		artistFour.setArtistId(4);
		artistFour.setName("Unni");


		names.add(artistOne);
		names.add(artistTwo);
		names.add(artistThree);
		names.add(artistFour);

		
		model.addAttribute("names", names);
		
		return "home";
	}
}
