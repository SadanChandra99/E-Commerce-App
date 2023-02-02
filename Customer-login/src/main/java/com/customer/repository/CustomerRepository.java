package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query(value="select * from customer_login where customer_email=?",nativeQuery=true)
	public Customer findByCustomerEmail(String userName);
}
