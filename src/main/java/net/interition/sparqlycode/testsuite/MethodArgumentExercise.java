package net.interition.sparqlycode.testsuite;

/**
 * @author Paul Worrall, Interition Ltd
 *
 */

/*
 * 
 * This Class is for a very basic test of how an ordinary method is represented in sparqlycode
 * 
 */



public class MethodArgumentExercise {
	
	private String str;
	private int size;
	private String[] others;

	// example of an ordinary method declaration
	public String doSomethingImportant(String str, int size, String[] others) {
		this.str = str;
		this.size = size;
		this.others = others;
		
		return "Whiteroom";
	}
}
