package com.customer.controller;

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

import com.customer.model.Customer;
import com.customer.serviceimpl.CustomerServiceImpl;


@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@PostMapping(value = "/add")
	public ResponseEntity<Customer> ComputerAdd(@RequestBody Customer employee){
		Customer com1 =  customerServiceImpl.addCustomer(employee);
		return  ResponseEntity.ok(com1);
				
	}
	
	@GetMapping(value = "/getall")
	public ResponseEntity<List<Customer>> ComputerGetAll(){
		
		List<Customer> employeelist = customerServiceImpl.getAllCustomers();
		return ResponseEntity.ok(employeelist);
		
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public ResponseEntity<Customer> ComputerById(@PathVariable("id") int id){
		Customer com2 = customerServiceImpl.getCustomerById(id);
		return ResponseEntity.ok(com2);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> ComputerDeleteById(@PathVariable("id") int id){
		customerServiceImpl.deleteCustomerById(id);
		return ResponseEntity.ok("Computer Deleted in Controller");
	}

}
