package com.learning.patterns.creational.factory.model;

public class ProductB extends Product{

	@Override
	public void writeName(String name) {
		StringBuilder tempName = new StringBuilder().append(name);
		super.writeName(tempName.reverse().toString());
	}
}
