package com.learning.patterns.creational.factory.headfirst.factory;

import java.util.Arrays;

import com.learning.patterns.creational.factory.headfirst.model.Pizza;
import com.learning.patterns.creational.factory.headfirst.model.PizzaHutCheesePizza;
import com.learning.patterns.creational.factory.headfirst.model.PizzaHutVeggiePizza;
import com.learning.patterns.creational.factory.headfirst.type.PizzaType;

public class PizzaHutPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		if(PizzaType.CHEESE.name().equals(type.name())) {
			return new PizzaHutCheesePizza(PizzaType.CHEESE.name() + "PizzaHut" , "Wheat", "White" , Arrays.asList("Tomato", "Onion"));
		}
		if(PizzaType.VEGGIE.name().equals(type.name())) {
			return new PizzaHutVeggiePizza(PizzaType.VEGGIE.name() + "PizzaHut", "Wheat", "Red" , Arrays.asList("Tomato", "Onion", "Capsicum", "Jalepeno"));
		}
		return null;
	}


}
