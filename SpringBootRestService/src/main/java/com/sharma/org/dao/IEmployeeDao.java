package com.sharma.org.dao;

import java.util.List;

import com.sharma.org.model.Employee;

public interface IEmployeeDao {
	
	public Employee findById(int id);
	public List<Employee> findAllEmployee();
	

}
