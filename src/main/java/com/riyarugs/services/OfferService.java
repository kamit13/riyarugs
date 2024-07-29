package com.riyarugs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riyarugs.entity.Offers;
import com.riyarugs.repository.OfferRepository;

@Service
public class OfferService {
	
	@Autowired
	private OfferRepository offerRepository;

	public OfferService(OfferRepository offerRepository) {
		super();
		this.offerRepository = offerRepository;
	}
	
	public Optional< List<Offers>> getOfferById(int id) {
		return Optional.ofNullable(offerRepository.findByProduct_ProductId(id));
	}
	
}
