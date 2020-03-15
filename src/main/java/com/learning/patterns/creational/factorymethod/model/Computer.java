package com.learning.patterns.creational.factorymethod.model;

public abstract class Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public Computer(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

	

	
	
	
	
	

}
