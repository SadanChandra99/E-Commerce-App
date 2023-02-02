package com.computers.controller;

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

import com.computers.model.Computer;
import com.computers.serviceimpl.ComputerServiceImpl;

@RestController
@RequestMapping("/computers")
public class ComputerController {
	
	@Autowired
	private ComputerServiceImpl computerServiceImpl;
	
	@PostMapping(value = "/add")
	public ResponseEntity<Computer> ComputerAdd(@RequestBody Computer computer){
		Computer com1 =  computerServiceImpl.addComputer(computer);
		return  ResponseEntity.ok(com1);
				
	}
	
	@GetMapping(value = "/getall")
	public ResponseEntity<List<Computer>> ComputerGetAll(){
		
		List<Computer> computerlist = computerServiceImpl.getAllComputers();
		return ResponseEntity.ok(computerlist);
		
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public ResponseEntity<Computer> ComputerById(@PathVariable("id") int id){
		Computer com2 = computerServiceImpl.getComputerById(id);
		return ResponseEntity.ok(com2);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> ComputerDeleteById(@PathVariable("id") int id){
		computerServiceImpl.deleteComputerById(id);
		return ResponseEntity.ok("Computer Deleted in Controller");
	}
	

}
