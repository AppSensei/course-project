package com.infiniteskills.mvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mvc.dao.EmployeeDao;
import com.infiniteskills.mvc.model.Employee;
import com.infiniteskills.mvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployeeListHql() {
		return employeeDao.getEmployeeListHql();
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

	@Override
	public int getEmployeeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

}
