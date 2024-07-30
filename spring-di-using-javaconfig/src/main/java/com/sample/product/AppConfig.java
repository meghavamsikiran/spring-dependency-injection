package com.sample.product;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean(name="mysql")
	public ProductDAOMySQL connectToMySQL() {
		return new ProductDAOMySQL();
	}
	
	@Bean(name="oracle")
	public ProductDAOOracle connectToOracle() {
		return new ProductDAOOracle();
	}
	
	@Bean(name="ps")
	public ProductServiceImpl ps() {
		ProductServiceImpl ps = new ProductServiceImpl();
		ps.setProductDao(connectToMySQL());
		//ps.setProductDao(connectToOracle()); // we can decide here to connect with either MySQL or Oracle
		return ps;
	}
}
