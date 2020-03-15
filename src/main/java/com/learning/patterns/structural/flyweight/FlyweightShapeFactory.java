package com.learning.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import static java.util.Objects.*;

public class FlyweightShapeFactory {

	private static Map<Color, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(Color color) {
		Shape shape = circleMap.get(color);
		if (nonNull(shape)) {
			return shape;
		} else {
			shape = new Circle(color);
			circleMap.put(color, shape);
			return shape;
		}

	}

}
