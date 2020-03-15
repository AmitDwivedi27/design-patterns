package com.learning.patterns.creational.prototype.model;

public class Dog extends Animal{

	@Override
	public Animal makeCopy() {
		System.out.println("Dog is being created here in makeCopy method");
		Dog dog = null;
		
		 try {
			dog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dog;
	}
	
	public String toString() {
		return "Hi I'm quite friendly but that doesn't mean you can harm me.";
	}

	
	
}
