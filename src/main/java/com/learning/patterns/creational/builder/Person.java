package com.learning.patterns.creational.builder;

import com.google.common.base.MoreObjects;

public class Person {

	private String title;
	private final String name;
	private final String surName;
	private String prefix;
	private PhoneNumber phoneNumber;

	public Person(PersonBuilder personBuilder) {
		this.title = personBuilder.title;
		this.name = personBuilder.name;
		this.surName = personBuilder.surName;
		this.prefix = personBuilder.prefix;
		this.phoneNumber = personBuilder.phoneNumber;
	}

	public static PersonBuilder builder() {
		return new PersonBuilder();
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("title", title).add("Name", name).add("SurName", surName)
				.add("Prefix", prefix).add("PhoneNumber", phoneNumber).toString();
	}

	/*
	 * The intent of the Builder design pattern is to separate the construction of a
	 * complex object from its representation. By doing so the same construction
	 * process can create different representations.[
	 */
	public static class PersonBuilder {

		private String title;
		private String name;
		private String surName;
		private String prefix;
		private PhoneNumber phoneNumber;

		private PersonBuilder() {

		}

		public PersonBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder withsurName(String surName) {
			this.surName = surName;
			return this;
		}

		public PersonBuilder withTitle(String title) {
			this.title = title;
			return this;
		}

		public PersonBuilder withPrefix(String prefix) {
			this.prefix = prefix;
			return this;
		}

		public PersonBuilder withPhoneNumber(PhoneNumber phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Person build() {
			// provide validation
			return new Person(this);
		}

	}

}
