package com.customer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;


@Component
public class CustomerServiceImpl {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
		 
	}
	
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}
	
	public String deleteCustomerById(int id) {
		customerRepository.deleteById(id);
		return "Customer deleted in ServiceImpl";
	}

}
