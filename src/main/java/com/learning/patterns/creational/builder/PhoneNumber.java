package com.learning.patterns.creational.builder;

import java.util.Comparator;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

import com.google.common.base.MoreObjects;

import com.google.common.base.Preconditions;
import com.learning.patterns.creational.builder.Person.PersonBuilder;

public class PhoneNumber implements Formattable, Comparable<PhoneNumber> {

	private final int areaCode;
	private final int number;
	private final int hashCode;

	private static final PhoneNumber COMMON = new PhoneNumber(123, 1234);

	private static final Comparator<PhoneNumber> CMP = Comparator.comparingInt(PhoneNumber::getAreaCode)
			.thenComparing(PhoneNumber::getNumber);

	private PhoneNumber(int areaCode, int number) {
		super();
		this.areaCode = areaCode;
		this.number = number;
		this.hashCode = Objects.hash(areaCode, number);
	}

	public static PhoneNumber Of(int areaCode, int number) {
		Preconditions.checkArgument(areaCode > 100, "Area code should be greater than 100");
		Preconditions.checkArgument(number > 100);
		if (areaCode == 123 && number == 1234) {
			return COMMON;
		}
		return new PhoneNumber(areaCode, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return Boolean.TRUE;
		if (obj instanceof PhoneNumber) {
			PhoneNumber phoneNumber = (PhoneNumber) obj;
			return Objects.equals(this.areaCode, phoneNumber.areaCode) && this.number == phoneNumber.number;
		}
		return Boolean.FALSE;
	}

	@Override
	public int hashCode() {
		return hashCode;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("areaCode", this.areaCode).add("number", this.number).toString();
	}

	@Override
	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		formatter.format("%d-%d", areaCode, number);
	}


	public int getAreaCode() {
		return areaCode;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int compareTo(PhoneNumber o) {
		return CMP.compare(this, o);

	}

}
