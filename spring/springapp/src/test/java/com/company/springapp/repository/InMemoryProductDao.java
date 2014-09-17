package com.company.springapp.repository;

import java.util.List;

import com.company.springapp.domain.Product;

public class InMemoryProductDao implements ProductDao {
	private List<Product> productList;
	
	public InMemoryProductDao(List<Product> productList){
		this.productList=productList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void saveProduct(Product product) {
		// TODO Auto-generated method stub

	}

}
