package com.riyarugs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.riyarugs.entity.Product;
import com.riyarugs.repository.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	 
	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	
	public   Optional<Product> getproductById(Long id){
		Optional<Product> product =  productRepository.findById(id);
		return product;
	}
	 
	public List<Product> getAllProduct() {
        Optional<List<Product>> productOptional = Optional.ofNullable(productRepository.findAll());
        return productOptional.orElse(null); 
    }
	
	@Transactional
	public void createProduct(Product product) {
		
		try { 
        productRepository.save(product);
		}catch(Exception e) {
			throw e;
		}
    }

}
