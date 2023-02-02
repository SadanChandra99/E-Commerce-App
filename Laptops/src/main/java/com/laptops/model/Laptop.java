package com.laptops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int laptopId;
	private String laptopName;
	private String laptopCompany;
	private String laptopDescription;
	private Double laptopPrice;
	private float laptopRating;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int laptopId, String laptopName, String laptopCompany, String laptopDescription, Double laptopPrice,
			float laptopRating) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopCompany = laptopCompany;
		this.laptopDescription = laptopDescription;
		this.laptopPrice = laptopPrice;
		this.laptopRating = laptopRating;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopCompany() {
		return laptopCompany;
	}
	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}
	public String getLaptopDescription() {
		return laptopDescription;
	}
	public void setLaptopDescription(String laptopDescription) {
		this.laptopDescription = laptopDescription;
	}
	public Double getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(Double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	public float getLaptopRating() {
		return laptopRating;
	}
	public void setLaptopRating(float laptopRating) {
		this.laptopRating = laptopRating;
	}
	
	
	
	

}
