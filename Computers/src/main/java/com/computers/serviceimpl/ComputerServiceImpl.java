package com.computers.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.computers.model.Computer;
import com.computers.repository.ComputerRepository;

@Component
public class ComputerServiceImpl {
	
	@Autowired
	private ComputerRepository computerRepository;
	
	public Computer addComputer(Computer computer) {
		return computerRepository.save(computer);
		 
	}
	
	public List<Computer> getAllComputers() {
		return computerRepository.findAll();
	}
	
	public Computer getComputerById(int id) {
		return computerRepository.findById(id).get();
	}
	
	public String deleteComputerById(int id) {
		computerRepository.deleteById(id);
		return "Computer deleted in ServiceImpl";
	}

}
