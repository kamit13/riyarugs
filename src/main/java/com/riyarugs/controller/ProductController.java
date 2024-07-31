package com.riyarugs.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.riyarugs.entity.Product;
import com.riyarugs.services.ProductService;

@RestController
public class ProductController {
	 private final ProductService productService;
	
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProduct() {
		List<Product> products = productService.getAllProduct();
		return  new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity< Optional<Product>> getProductByID(@PathVariable Long id){
	Optional<Product> product=	productService.getproductById(id);
		return  new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@PostMapping("/create/product")
	public ResponseEntity<Void> createProduct(@RequestBody Product product) {
		try {
		productService.createProduct(product);
		return new ResponseEntity<>(HttpStatus.CREATED);
		} catch(Exception e) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
