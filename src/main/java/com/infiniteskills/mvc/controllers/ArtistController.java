package com.infiniteskills.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.infiniteskills.mvc.model.Artist;
import com.infiniteskills.mvc.service.AlbumService;
import com.infiniteskills.mvc.service.ArtistService;

@Controller
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	ArtistService artistService;

	@Autowired
	AlbumService albumservice;

	@RequestMapping("/ajax")
	public ModelAndView helloAjaxTest() {
		return new ModelAndView("ajaxtest", "message",
				" Loaded Spring MVC with Ajax and JQuery Demo..");
	}

	@RequestMapping(value = "/displayPop")
	public @ResponseBody String displayPop(Model model) {
		return "More details have been emailed to you.";
	}
	
	@RequestMapping(value = "/requestBody")
	@ResponseBody
	public String displayPop(@RequestBody String artist) {
		
		System.out.println("Request Body Annotation: " + artist);
		return "More details have been emailed to you.";
	}

	@RequestMapping(value = "/getArtists", method = RequestMethod.GET)
	public String getAllArtists(Model model) {
		System.out.println("Retrieving All Artists and inner joining Albums");

		List<Artist> getListOfArtists = artistService.getArtistHql();
		model.addAttribute("newArtist", new Artist());
		model.addAttribute("artists", getListOfArtists);

		return "home";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String saveNewArtistInstance(Model model) {

		model.addAttribute("albumOptions", this.albumservice.getAlbumsHql());
		model.addAttribute("artist", new Artist());
		return "artist_add";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveArtistObject(@ModelAttribute Artist artist) {

		if (artist != null) {
			artistService.saveArtistnAlbums(artist);

		}

		return "redirect:/artist/add";

	}
}
