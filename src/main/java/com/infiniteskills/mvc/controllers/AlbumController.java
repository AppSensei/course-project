package com.infiniteskills.mvc.controllers;

import java.util.List;

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
		System.out.println("Show Student Portal.");
		Album album = new Album();
		model.addAttribute("album", album);
		return "album";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("stu") Album student, Model model) {
		System.out.println("Save FROM Student Portal.");

/*		model.addAttribute("name", student.getName());
		model.addAttribute("guardian", student.getGuardian());
		model.addAttribute("authHours", student.getAuthHours());
		model.addAttribute("tutionCosts", student.getTutionCosts());
		model.addAttribute("description", student.getDescription());
*/
		return "student";
	}
	
	@RequestMapping(value="/getAlbums")
	public List<Album> getAllAlbums() {
		System.out.println("Retrieving All Albums");
		
		List<Album> albums = albumService.getAlbums();
		return albums;
	}
	
	@RequestMapping(value="/getAlbum")
	public Album getAllAlbumById() {
		System.out.println("Retrieving Single Album");
		
		Album album = albumService.getSingleAlbumById();
		
		return album;
	}
	
	@RequestMapping(value="delete")
	public void deleteAlbum() {
		
		System.out.println("Deleting Single Album");
		
		albumService.deleteById(5);

	}

}
