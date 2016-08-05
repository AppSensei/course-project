package com.infiniteskills.mvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/project")
public class ProjectController {
	
	@RequestMapping(value="/add")
	public String addProject() {
		System.out.println("Project Add Page Initiated !!");
		return "project_add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String saveProject() {
		System.out.println("Project Save Initiated !!");
		return "project_add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi"})
	public String saveMultiyearProject() {
		System.out.println("saveMultiyearProject Save Initiated !!");
		return "project_add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=single","special"})
	public String saveSpecialProject() {
		System.out.println("saveSpecialProject Save Initiated !!");
		return "project_add";
	}
	
	@RequestMapping(value="/{test}")
	public String testPath(@PathVariable ("test") String testPath, ModelAndView mv) {
		
		return null;
		
	}

}
