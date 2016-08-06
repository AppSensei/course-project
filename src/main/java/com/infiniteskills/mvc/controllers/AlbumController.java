package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.model.Album;

@Controller
@RequestMapping("/student")
public class AlbumController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showAddStudent(Model model) {
		System.out.println("Show Student Portal.");
		Album student = new Album();
		model.addAttribute("student", student);
		return "student";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("stu") Album student, Model model) {
		System.out.println("Save FROM Student Portal.");

		model.addAttribute("name", student.getName());
		model.addAttribute("guardian", student.getGuardian());
		model.addAttribute("authHours", student.getAuthHours());
		model.addAttribute("tutionCosts", student.getTutionCosts());
		model.addAttribute("description", student.getDescription());

		return "student";
	}
	
	public void studentSecurity() {
		System.out.println("I'm secure!!");
	}

}
