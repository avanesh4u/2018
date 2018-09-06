package com.sharma.org.controller;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.org.model.Employee;
import com.sharma.org.service.IEmployeeService;

@RestController
@RequestMapping(value= {"/employee"})
public class EmployeeController {
	
	@Autowired
	IEmployeeService empService;

	@RequestMapping("/employee/hello")
	public String sayHello() {
		
		return "Hello ! Welcome to controller Page.";
	}
	
	
	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id){
		
		System.out.println("Fetching Employee with ID :: "+id);
		
		Employee emp = empService.getEmployeeById(id);
		
		if(emp == null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		}		
	
	}
	
	
}
