package com.learning.patterns.creational.prototype;

import com.learning.patterns.creational.prototype.model.Animal;
import com.learning.patterns.creational.prototype.model.Dog;

public class CloneTest {
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		System.out.println(dog);
		CloneFactory cloneFactory = new CloneFactory();
		Animal dog1 = cloneFactory.getClone(dog);
		System.out.println(dog1);
		//System.out.println(System.identityHashCode(dog) == System.identityHashCode(animal));
	}

}
