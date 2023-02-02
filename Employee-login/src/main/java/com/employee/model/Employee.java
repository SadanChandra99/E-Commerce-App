package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_jwt")
public class Employee {
	
	@Id
	private String employeeEmail;
	private String employeeUserName;
	private String employeePassword;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String employeeUserName, String employeePassword, String employeeEmail) {
		super();
		
		this.employeeUserName = employeeUserName;
		this.employeePassword = employeePassword;
		this.employeeEmail = employeeEmail;
	}
	
	public String getEmployeeUserName() {
		return employeeUserName;
	}
	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	
	
		
	
	

}
