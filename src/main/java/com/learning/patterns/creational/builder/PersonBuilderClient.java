package com.learning.patterns.creational.builder;

public class PersonBuilderClient {
	
	public static void main(String[] args) {
		//PhoneNumber common = PhoneNumber.Of(123, 1234);

		//System.out.println(String.format("%s", common));

		Person person =	Person.builder().withName("Chhotu").withPrefix("Er").withsurName("Dwivedi")
		.withPhoneNumber(PhoneNumber.Of(123, 1234)).build();
	
		System.out.println(person);


	}

}
