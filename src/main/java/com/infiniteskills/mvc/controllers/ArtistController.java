package com.infiniteskills.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.service.ArtistService;

@Controller
@RequestMapping("/artist")
public class ArtistController {
	
	@Autowired
	ArtistService artistService;
	
	@RequestMapping(value = "/getArtists", method=RequestMethod.GET)
	public void getAllArtists() {
		System.out.println("Retrieving All Artists and inner joining Albums");

		artistService.getArtistHql();
	}

}
