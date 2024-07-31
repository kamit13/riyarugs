package com.riyarugs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.riyarugs.DTO.OfferDTO;
import com.riyarugs.entity.Offers;
import com.riyarugs.entity.Product;
import com.riyarugs.repository.OfferRepository;
import com.riyarugs.repository.ProductRepository;
import com.riyarugs.utility.OffersUtils;

@Service
public class OfferService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OfferRepository offerRepository;

	public OfferService(OfferRepository offerRepository) {
		super();
		this.offerRepository = offerRepository;
	}
	
	public Optional< List<Offers>> getOfferById(int id) {
		return Optional.ofNullable(offerRepository.findByProduct_ProductId(id));
	}
	
	@Transactional
	public void crateOffers(OfferDTO offerRequest) {
		 Product product = productRepository.findById((long)offerRequest.getProductId())
	                .orElseThrow(() -> new RuntimeException("Product not found"));
	      
        try {
        	offerRepository.save(OffersUtils.createOfferObject( product, offerRequest));
        }catch(Exception e) {
        	throw new RuntimeException(e);
        }
	}
}
