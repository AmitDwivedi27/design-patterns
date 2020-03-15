package com.learning.patterns.creational.factory;

import com.learning.patterns.creational.factory.model.Product;

public class ProductFactoryClient {

	
	public static void main(String[] args) {
	
		Product prod;
		prod = ProductFactory.createProduct("A");
		prod.writeName("John Doe");
		prod = ProductFactory.createProduct("B");
		prod.writeName("John Doe");
	}
}
