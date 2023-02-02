package com.laptops.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptops.model.Laptop;
import com.laptops.repository.LaptopRepository;


@Component
public class LaptopServiceImpl {
	
	
	@Autowired
	private LaptopRepository laptopRepository;
	
	public Laptop addLaptop(Laptop laptop) {
		return laptopRepository.save(laptop);
		 
	}
	
	public List<Laptop> getAllLaptops() {
		return laptopRepository.findAll();
	}
	
	public Laptop getLaptopById(int id) {
		return laptopRepository.findById(id).get();
	}
	
	public String deleteLaptopById(int id) {
		laptopRepository.deleteById(id);
		return "Computer deleted in ServiceImpl";
	}


}
