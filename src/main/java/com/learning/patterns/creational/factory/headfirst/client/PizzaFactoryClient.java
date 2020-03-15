package com.learning.patterns.creational.factory.headfirst.client;

import com.learning.patterns.creational.factory.headfirst.factory.DominosPizzaStore;
import com.learning.patterns.creational.factory.headfirst.factory.PizzaHutPizzaStore;
import com.learning.patterns.creational.factory.headfirst.factory.PizzaStore;
import com.learning.patterns.creational.factory.headfirst.type.PizzaType;

public class PizzaFactoryClient {
	
	public static void main(String[] args) {
		PizzaStore pizzaHutStore = new PizzaHutPizzaStore();
		pizzaHutStore.orderPizza(PizzaType.CHEESE);
		
		
		PizzaStore dominosStore = new DominosPizzaStore();
		dominosStore.orderPizza(PizzaType.VEGGIE);
	}

}
