package net.interition.sparqlycode.testsuite;

import org.apache.commons.lang3.StringUtils;

public class ForeignCodeUserClass {

	private String somethingImportant;

	public static void main(String[] args) {

		ForeignCodeUserClass c = new ForeignCodeUserClass();

		c.setSomethingImportant("The gypsy woman told my Mother when I was born");

		System.out.println(c.abbreviateToTen());
	}

	public String getSomethingImportant() {
		return somethingImportant;
	}

	public void setSomethingImportant(String somethingImportant) {
		this.somethingImportant = somethingImportant;
	}

	public String abbreviateToTen() {

		return StringUtils.abbreviate(this.somethingImportant, 10);

	}

}
