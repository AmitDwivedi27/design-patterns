package com.learning.patterns.creational.factory.headfirst.factory;

import com.learning.patterns.creational.factory.headfirst.model.Pizza;
import com.learning.patterns.creational.factory.headfirst.type.PizzaType;

public abstract class PizzaStore {
	
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza ;
		
	}

	public abstract Pizza createPizza(PizzaType type) ;

}
