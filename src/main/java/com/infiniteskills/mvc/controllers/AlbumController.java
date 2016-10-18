package com.infiniteskills.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.service.AlbumService;

@Controller
@RequestMapping("/albums")
public class AlbumController {
	
	@Autowired
	AlbumService albumService;

	@RequestMapping(value = "/album", method = RequestMethod.GET)
	public String showAddAlbum(Model model) {
		Album album = new Album();
		model.addAttribute("album", album);
		return "album";
	}

	@RequestMapping(value = "/saveAlbumChinook", method = RequestMethod.GET)
	public void saveAlbumTest() {
		albumService.saveAlbum();
	}

	@RequestMapping(value = "/saveAlbum", method = RequestMethod.GET)
	public String saveAlbum(@ModelAttribute("album") Album album, Model model) {
		System.out.println("Save Album....");

		model.addAttribute("album", album);
		return "student";
	}

	@RequestMapping(value = "/getalbums", method=RequestMethod.GET)
	public void getAllAlbums() {

		 albumService.getAlbumsHql();
	}

	@RequestMapping(value = "/getAlbum")
	public Album getAllAlbumById() {
		System.out.println("Retrieving Single Album");

		Album album = albumService.getSingleAlbumById();

		return album;
	}

	@RequestMapping(value = "delete")
	public void deleteAlbum() {

		System.out.println("Deleting Single Album");
		albumService.deleteById(5);

	}

}
