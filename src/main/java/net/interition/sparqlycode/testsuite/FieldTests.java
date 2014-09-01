package net.interition.sparqlycode.testsuite;

public class FieldTests {
	
	static {
			System.loadLibrary ("native");
    }
	
	// this field must be on line number 10 for its test to pass
	public static final int testField = 0;

	public String sayHello() {
		return "nowt";
	}
	
	// native allows us to find code that might call out to other libraries outside the control of the JVM
	public native String externalCode() ;

}
