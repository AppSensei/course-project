package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showAddStudent(Model model) {
		System.out.println("Show Student Portal.");
		Student student = new Student();
		model.addAttribute("student", student);
		return "student";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("stu") Student student, Model model) {
		System.out.println("Save FROM Student Portal.");

		model.addAttribute("name", student.getName());
		model.addAttribute("guardian", student.getGuardian());
		model.addAttribute("authHours", student.getAuthHours());
		model.addAttribute("tutionCosts", student.getTutionCosts());
		model.addAttribute("description", student.getDescription());

		return "student";
	}

}
