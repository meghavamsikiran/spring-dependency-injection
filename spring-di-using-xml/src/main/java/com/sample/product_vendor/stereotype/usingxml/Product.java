package com.sample.product_vendor.stereotype.usingxml;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int productId;
	private String productName;
	private Vendor v1;
	public Product() {
		super();
	}
	public Product(int productId, String productName, Vendor vendorVar) {
	    super();
	    this.productId = productId;
	    this.productName = productName;
	    this.v1 = vendorVar; // Fix: assign vendorVar to v1
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
	public Vendor getV1() {
		return v1;
	}
	public void setV1(Vendor v1) {
		this.v1 = v1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
		return result;
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
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (v1 == null) {
			if (other.v1 != null)
				return false;
		} else if (!v1.equals(other.v1))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", vendorVar=" + v1 + "]";
	}
}
