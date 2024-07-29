package com.riyarugs.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.riyarugs.entity.Offers;
import com.riyarugs.entity.Product;
import com.riyarugs.services.OfferService;

@RestController
public class OfferController {
	

	@Autowired
	private OfferService offerService;

	public OfferController(OfferService offerService) {
		super();
		this.offerService = offerService;
	}
	 
	@GetMapping("/getOffer/{productId}")
	public ResponseEntity<List<Offers>> getOfferById(@PathVariable int productId) {
	    Optional<List<Offers>> offer = offerService.getOfferById(productId);
	    if (offer.isPresent()) {
	        return new ResponseEntity<>(offer.get(), HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
}
