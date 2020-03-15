package com.learning.patterns.creational.factory.headfirst.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	private String name;
	private String dough;
	private String sauce;
	private List<String> toppings = new ArrayList<>();
	
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ");
		System.out.println("Adding sauce ");
		toppings.stream().forEach(System.out :: println);
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 340 ");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza diagonally to pieces");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore Box");
	}

	public Pizza(String name, String dough, String sauce, List<String> toppings) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public String getDough() {
		return dough;
	}

	public String getSauce() {
		return sauce;
	}

	public List<String> getToppings() {
		return toppings;
	}
	
	
	

}
