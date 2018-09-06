package com.sharma.org.service;

import java.util.List;

import com.sharma.org.model.Employee;

public interface IEmployeeService {
	
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployee();
	

}
