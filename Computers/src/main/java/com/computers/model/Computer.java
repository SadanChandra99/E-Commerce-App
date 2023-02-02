package com.computers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Computer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int computerId;
	private String computerName;
	private String computerCompany;
	private Double computerPrice;
	private String computerDescription;
	private float computerRating;
	
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Computer(int computerId, String computerName, String computerCompany, Double computerPrice,
			String computerDescription, float computerRating) {
		super();
		this.computerId = computerId;
		this.computerName = computerName;
		this.computerCompany = computerCompany;
		this.computerPrice = computerPrice;
		this.computerDescription = computerDescription;
		this.computerRating = computerRating;
	}


	public int getComputerId() {
		return computerId;
	}


	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}


	public String getComputerName() {
		return computerName;
	}


	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}


	public String getComputerCompany() {
		return computerCompany;
	}


	public void setComputerCompany(String computerCompany) {
		this.computerCompany = computerCompany;
	}


	public Double getComputerPrice() {
		return computerPrice;
	}


	public void setComputerPrice(Double computerPrice) {
		this.computerPrice = computerPrice;
	}


	public String getComputerDescription() {
		return computerDescription;
	}


	public void setComputerDescription(String computerDescription) {
		this.computerDescription = computerDescription;
	}


	public float getComputerRating() {
		return computerRating;
	}


	public void setComputerRating(float computerRating) {
		this.computerRating = computerRating;
	}
	
	
	
	
	
}
