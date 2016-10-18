package com.infiniteskills.mvc.dao;

import java.util.List;

import com.infiniteskills.mvc.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getEmployeeListHql();
	
	public Employee getEmployeeById(int employeeId);
	
	public int getEmployeeCount();
	
	public void deleteEmployeeById(int id);
	
	public void saveEmployee(Employee employee);

	public void updateEmployee();

}
