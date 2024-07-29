package com.riyarugs.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productDescription;
	private int price;
	private Date createdDate;
	private Date updatedDate;
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Offers> offers;
	
	public Product(){}
	
	
	public Product(int productId, String productName, String prdouctDesc, int price, Date createdDate,
			Date updatedDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = prdouctDesc;
		this.price = price;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getPrdouctDesc() {
		return productDescription;
	}
	
	public void setPrdouctDesc(String prdouctDesc) {
		this.productDescription = prdouctDesc;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	 
	@Override
	public int hashCode() {
		return Objects.hash(createdDate, productDescription, price, productId, productName, updatedDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(createdDate, other.createdDate) && Objects.equals(productDescription, other.productDescription)
				&& price == other.price && productId == other.productId
				&& Objects.equals(productName, other.productName) && Objects.equals(updatedDate, other.updatedDate);
	}
}
