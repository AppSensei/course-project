package com.infiniteskills.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infiniteskills.mvc.model.Employee;
import com.infiniteskills.mvc.service.EmployeeService;

@Controller
@RequestMapping(value = "/employee")
public class EmployeController {

	private static final Logger logger = Logger
			.getLogger(EmployeController.class);

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value="/list")
	public void getAllEmployees() {

		logger.info("Gets all the employees");
		employeeService.getEmployeeListHql();
	}
	
	@RequestMapping(value="/byId/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) {
		
		logger.info("Get Employee by Employee ID: " + employeeId);
		employeeService.getEmployeeById(employeeId);
		return null;
		
	}

}
