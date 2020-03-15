package com.learning.patterns.structural.flyweight;

public class FlyweightFactoryClient {
	
	public static void main(String[] args) {
		Shape shape = FlyweightShapeFactory.getCircle(Color.GREEN);
		shape.draw();
		Shape shape1 = FlyweightShapeFactory.getCircle(Color.GREEN);
		shape1.draw();
		Shape shape2 = FlyweightShapeFactory.getCircle(Color.GREEN);
		shape2.draw();
		System.out.println(shape == shape1);
		System.out.println(shape1 == shape2);
	}

}
