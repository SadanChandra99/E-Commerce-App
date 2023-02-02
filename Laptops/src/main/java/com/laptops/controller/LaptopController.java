package com.laptops.controller;

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

import com.laptops.model.Laptop;
import com.laptops.serviceimpl.LaptopServiceImpl;


@RestController
@RequestMapping("/laptops")
public class LaptopController {
	
		
		@Autowired
		private LaptopServiceImpl laptopServiceImpl;
		
		@PostMapping(value = "/add")
		public ResponseEntity<Laptop> ComputerAdd(@RequestBody Laptop laptop){
			Laptop com1 =  laptopServiceImpl.addLaptop(laptop);
			return  ResponseEntity.ok(com1);
					
		}
		
		@GetMapping(value = "/getall")
		public ResponseEntity<List<Laptop>> ComputerGetAll(){
			
			List<Laptop> laptoplist = laptopServiceImpl.getAllLaptops();
			return ResponseEntity.ok(laptoplist);
			
		}
		
		@GetMapping(value = "/getbyid/{id}")
		public ResponseEntity<Laptop> ComputerById(@PathVariable("id") int id){
			Laptop com2 = laptopServiceImpl.getLaptopById(id);
			return ResponseEntity.ok(com2);
		}
		
		@DeleteMapping(value = "/delete/{id}")
		public ResponseEntity<String> ComputerDeleteById(@PathVariable("id") int id){
			laptopServiceImpl.deleteLaptopById(id);
			return ResponseEntity.ok("Laptop Deleted in Controller");
		}
		

	
}
