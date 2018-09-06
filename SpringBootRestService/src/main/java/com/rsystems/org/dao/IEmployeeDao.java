package com.rsystems.org.dao;

import java.util.List;

import com.rsystems.org.model.Employee;

public interface IEmployeeDao {
	
	public Employee findById(int id);
	public List<Employee> findAllEmployee();
	

}
