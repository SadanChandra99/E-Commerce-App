package com.laptops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptops.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
