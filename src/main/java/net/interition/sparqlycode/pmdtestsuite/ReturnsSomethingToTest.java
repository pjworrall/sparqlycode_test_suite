package net.interition.sparqlycode.pmdtestsuite;

import java.util.HashMap;

public class ReturnsSomethingToTest {
	
	private int value = 1 ;
	private String stringValue = "testing a string" ;
	private HashMap<?, ?> map  = new HashMap<Object, Object>();

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public HashMap<?, ?> getMap() {
		return map;
	}

	public void setMap(HashMap<?, ?> map) {
		this.map = map;
	}
	

}
