package com.infiniteskills.mvc.daoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteskills.mvc.dao.EmployeeDao;
import com.infiniteskills.mvc.model.Customer;
import com.infiniteskills.mvc.model.Employee;
import com.infiniteskills.mvc.service.EmployeeService;

@Repository
@Transactional(readOnly = true)
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	EmployeeService employeeService;

	@Override
	public List<Employee> getEmployeeListHql() {

		Session session = sessionFactory.openSession();
		String hql = "";
		hql = "From Employee";
		List<Employee> employeList = null;

		try {

			Query query = session.createQuery(hql);
			employeList = query.list();

		} catch (HibernateException e) {

			e.printStackTrace();
		}

		return employeList;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {

		Session session = sessionFactory.openSession();
/*		String hql = "";
		hql = "select firstName, lastName from Employee e where e.employeeId = :employeeId";*/
		Employee employee = null;

		try {

			//employee = (Employee) session.get(Employee.class, employeeId);
			employee = (Employee) session.load(Employee.class, employeeId);

			System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
			System.out.println("Job Title: " + employee.getTitle());
			System.out.println();
						
			for (Customer cust : employee.getCustomers()) {
				System.out.println();
				System.out.println("Customer ID: " + cust.getCustomerId());
				System.out.println("Customer Name: " + cust.getFirstName() + " " + cust.getLastName());
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return employee;
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
