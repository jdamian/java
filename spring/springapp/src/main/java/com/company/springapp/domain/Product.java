package com.company.springapp.domain;

public class Product {
	
	private static final long serialVersionUID=1L;
	private String description;
	private Double price;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Description: " + description + ",");
		buffer.append("Prices: " +price);
		return buffer.toString();
	}
	

}
