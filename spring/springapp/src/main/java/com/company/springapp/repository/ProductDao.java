package com.company.springapp.repository;

import java.util.List;

import com.company.springapp.domain.Product;

public interface ProductDao {
	public List<Product> getProductList();
	public void saveProduct(Product product);
}
