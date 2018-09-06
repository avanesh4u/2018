package com.rsystems.org.service;

import java.util.List;

import com.rsystems.org.model.Employee;

public interface IEmployeeService {
	
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployee();
	

}
