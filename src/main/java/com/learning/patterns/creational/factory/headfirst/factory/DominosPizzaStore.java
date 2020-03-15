package com.learning.patterns.creational.factory.headfirst.factory;

import java.util.Arrays;

import com.learning.patterns.creational.factory.headfirst.model.DominosCheesePizza;
import com.learning.patterns.creational.factory.headfirst.model.DominosStyleVeggiePizza;
import com.learning.patterns.creational.factory.headfirst.model.Pizza;
import com.learning.patterns.creational.factory.headfirst.type.PizzaType;

public class DominosPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(PizzaType type) {
		if(PizzaType.CHEESE.name().equals(type.name())) {
			return new DominosCheesePizza(PizzaType.CHEESE.name() + " Dominos" , "Wheat", "White" , Arrays.asList("Tomato", "Onion"));
		}
		if(PizzaType.VEGGIE.name().equals(type.name())) {
			return new DominosStyleVeggiePizza(PizzaType.VEGGIE.name() + " Dominos", "Wheat", "Red" , Arrays.asList("Tomato", "Onion", "Capsicum", "Jalepeno"));
		}
		return null;
	}

}
