package com.learning.patterns.creational.prototype;

import com.learning.patterns.creational.prototype.model.Animal;

public class CloneFactory {

	public Animal getClone(Animal animalSample) {
		return animalSample.makeCopy();
	}

}
