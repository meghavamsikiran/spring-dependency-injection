package com.sample.product;

public class ProductServiceImpl {
	
	private ProductDAO productDao;
	
	public void addRecord() {
		productDao.addProduct();
	}
	public ProductServiceImpl() {
		super();
	}

	public ProductServiceImpl(ProductDAO productDao) {
		super();
		this.productDao = productDao;
	}

	public ProductDAO getProductDao() {
		return productDao;
	}
	
	public void setProductDao(ProductDAO productDao) {
		this.productDao = productDao;
	}
	

	@Override
	public String toString() {
		return "ProductServiceImpl [productDao=" + productDao + "]";
	}
}
