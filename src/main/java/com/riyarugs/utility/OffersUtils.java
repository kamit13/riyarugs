package com.riyarugs.utility;

import com.riyarugs.DTO.OfferDTO;
import com.riyarugs.entity.Offers;
import com.riyarugs.entity.Product;

public class OffersUtils {
	
	public static Offers createOfferObject(Product product, OfferDTO offerRequest ) {
		Offers offer = new Offers();
        offer.setProduct(product);
        offer.setOfferTitle(offerRequest.getOfferTitle());
        offer.setOfferDescription(offerRequest.getOfferDescription());
        offer.setDiscountPercentage(offerRequest.getDiscountPercentage());
        offer.setStartDate(offerRequest.getStartDate());
        offer.setEndDate(offerRequest.getEndDate());
        return offer;
	}

}
