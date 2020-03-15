package com.learning.patterns.creational.factory;

import com.learning.patterns.creational.factory.model.Product;
import com.learning.patterns.creational.factory.model.ProductA;
import com.learning.patterns.creational.factory.model.ProductB;

public class ProductFactory {

	public static Product createProduct(String type) {
		if (type.equals("B"))
			return new ProductB();
		else
			return new ProductA();
	}

}
