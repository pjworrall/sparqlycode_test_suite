package net.interition.sparqlycode.testsuite;

/**
 * 
 * @author Paul Worrall, Interition Ltd.
 *
 */
public class FieldTests {
	// this field must be on line number 10 for its test to pass
	public static final int testField = 0;
	
	static {
		System.loadLibrary ("native");
	}

	private static int[] ages = { 10, 20 , 30 ,40, 50, 50}; 
	private static int[] height = new int[10];
	private String[][] names = {{"Tom","Mo"},
			{"Curtis", "Morris"}
	};

	public String sayHello() {
		return "nowt";
	}

	// native allows us to find code that might call out to other libraries outside the control of the JVM
	public native String externalCode() ;

}
