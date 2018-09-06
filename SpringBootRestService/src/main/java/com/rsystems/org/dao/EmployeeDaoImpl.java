package com.rsystems.org.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.rsystems.org.model.Employee;


@Repository
public class EmployeeDaoImpl implements IEmployeeDao {


	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		List<Employee> employeeList= 
		listEmployee().stream().filter((e -> e.getId()==id)).collect(Collectors.toList());
		
		return (Employee)employeeList.get(0);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	private List<Employee> listEmployee(){
		Employee e1 = new Employee(1001,"Ramesh","Noida",50000);
		Employee e2 = new Employee(1004,"Mahesh","Delhi",20000);
		Employee e3 = new Employee(1033,"Avanesh","Gurgaon",90000);
		Employee e4 = new Employee(1005,"Surseh","Gr. Noida",30000);
		Employee e5 = new Employee(1006,"Dinesh","Pune",40000);	
		
		List<Employee> empList = new ArrayList<Employee>();
					empList.add(e1);
					empList.add(e2);
					empList.add(e3);
					empList.add(e4);
					empList.add(e5);
		
		
		return empList;
	}	

}
