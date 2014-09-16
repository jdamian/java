package com.company.springapp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductTests {
	
	private Product product;
	
	@Before
	public void setUp() throws Exception{
		product = new Product();
	}
	
	@Test
	public void testSetAndGetDescription(){
		String testDescription = "aDescription";
		assertNull(product.getDescription());
		product.setDescription(testDescription);
		assertEquals(testDescription, product.getDescription());
		
	}
	
	@Test
	public void testSetAndGetPrice(){
		double testPrices = 100.00;
		assertEquals(0, 0,0);
		product.setPrice(testPrices);
		assertEquals(testPrices, product.getPrice(),0);
	}

}
