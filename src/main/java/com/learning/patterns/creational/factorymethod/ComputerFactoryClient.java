package com.learning.patterns.creational.factorymethod;

import com.learning.patterns.creational.factorymethod.model.Computer;

public class ComputerFactoryClient {
	
	public static void main(String[] args) {
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "64", "5000", "i-9");
		System.out.println(server);
		
		Computer pc = ComputerFactory.getComputer(ComputerType.SERVER, "4", "500", "i-3");
		System.out.println(pc);
	}

}
