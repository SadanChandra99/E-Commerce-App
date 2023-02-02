package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeServiceImpl;



@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping(value = "/add")
	public ResponseEntity<Employee> ComputerAdd(@RequestBody Employee employee){
		Employee com1 =  employeeServiceImpl.addEmployee(employee);
		return  ResponseEntity.ok(com1);
				
	}
	
	@GetMapping(value = "/getall")
	public ResponseEntity<List<Employee>> ComputerGetAll(){
		
		List<Employee> employeelist = employeeServiceImpl.getAllEmployees();
		return ResponseEntity.ok(employeelist);
		
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public ResponseEntity<Employee> ComputerById(@PathVariable("id") int id){
		Employee com2 = employeeServiceImpl.getEmployeeById(id);
		return ResponseEntity.ok(com2);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> ComputerDeleteById(@PathVariable("id") int id){
		employeeServiceImpl.deleteEmployeeById(id);
		return ResponseEntity.ok("Computer Deleted in Controller");
	}
	

}
