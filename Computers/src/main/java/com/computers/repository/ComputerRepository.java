package com.computers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.computers.model.Computer;

public interface ComputerRepository  extends JpaRepository<Computer, Integer>{

}
