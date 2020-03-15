package com.learning.patterns.creational.factorymethod;

import java.util.Objects;

import com.google.common.base.Preconditions;
import com.learning.patterns.creational.factorymethod.model.Computer;
import com.learning.patterns.creational.factorymethod.model.PC;
import com.learning.patterns.creational.factorymethod.model.Server;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerType computerType , String ram, String hdd, String cpu) {
		Preconditions.checkArgument(Objects.nonNull(computerType));
		if(computerType.equals(ComputerType.PC))
		{
			return new PC(ram, hdd, cpu);
		}
		if(computerType.equals(ComputerType.SERVER)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
		
	}

}
