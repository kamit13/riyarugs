package com.riyarugs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riyarugs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
