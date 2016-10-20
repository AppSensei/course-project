package com.infiniteskills.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.model.Artist;
import com.infiniteskills.mvc.service.ArtistService;

@Controller
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	ArtistService artistService;

	@RequestMapping(value = "/getArtists", method = RequestMethod.GET)
	public String getAllArtists(Model model) {
		System.out.println("Retrieving All Artists and inner joining Albums");

		List<Artist> getListOfArtists = artistService.getArtistHql();
		model.addAttribute("newArtist", new Artist());
		model.addAttribute("artists", getListOfArtists);

		return "home";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String saveArtist(@ModelAttribute("artist") Artist artist, ModelMap model) {

		model.addAttribute("artistId", artist.getArtistId());
		model.addAttribute("name", artist.getName());
		model.addAttribute("albums", artist.getAlbums());
		return null;

	}
}
