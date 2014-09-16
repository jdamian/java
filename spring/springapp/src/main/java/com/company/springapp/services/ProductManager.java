package com.company.springapp.services;

import java.io.Serializable;
import java.util.List;

import com.company.springapp.domain.Product;

public interface ProductManager extends Serializable {
	public void increasePrice(int percentage);
	public List<Product> getProducts();
}
