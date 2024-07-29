package com.riyarugs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riyarugs.entity.Offers;

public interface OfferRepository extends JpaRepository<Offers, Integer> {
	List<Offers> findByProduct_ProductId(int productId);
}
