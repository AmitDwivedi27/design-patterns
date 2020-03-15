package com.learning.patterns.structural.flyweight;

public class Circle implements Shape {

	private Color color;

	public Circle(Color color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.printf("Circle drawn of colour %s \n", color);
		
	}
	
	
	

	

}
