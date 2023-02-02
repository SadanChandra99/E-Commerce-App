package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.jwt.JwtUtills;
import com.customer.model.Customer;
import com.customer.security.CustomerLoginDetails;
import com.customer.security.CustomerLoginDetailsService;

@RestController
@RequestMapping(value = "/customer/auth")
public class AuthenticationController {
	
	@Autowired
	private CustomerLoginDetailsService customerLoginDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtills jwtUtills;

	@PostMapping(value = "/authentication")
	public String authenticated(@RequestBody Customer customer) {
	
		
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(customer.getCustomerEmail(), customer.getCustomerPassword()));
			System.out.println(authentication);
			if(authentication.isAuthenticated()) {
				
				CustomerLoginDetails customerLoginDetails =  (CustomerLoginDetails) customerLoginDetailsService.loadUserByUsername(customer.getCustomerEmail());
				String token = jwtUtills.generateJwtToken(customerLoginDetails);
				return token;
				
			}
			
			else {
				return "Not Authenticated";
			}
		
	
		
	}

}
