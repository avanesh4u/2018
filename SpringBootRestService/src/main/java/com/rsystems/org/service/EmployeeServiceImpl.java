package com.rsystems.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsystems.org.dao.EmployeeDaoImpl;
import com.rsystems.org.dao.IEmployeeDao;
import com.rsystems.org.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao employeeDao = new EmployeeDaoImpl(); 
	
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAllEmployee();
	}

}
