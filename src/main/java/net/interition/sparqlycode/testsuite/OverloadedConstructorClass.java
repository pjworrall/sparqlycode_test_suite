package net.interition.sparqlycode.testsuite;

/**
 * @author Paul Worrall, Interition Ltd
 *
 */

public class OverloadedConstructorClass {
	
	private String mothersName;
	private String fathersName;
	private String brothersName;
	private String sistersName;
	
	
	public OverloadedConstructorClass(String mothersName, String fathersName, String brothersName ) {
		this.mothersName = mothersName;
		this.fathersName = fathersName;
		this.brothersName = brothersName;
	}
	
	public OverloadedConstructorClass(String mothersName, String fathersName) {
		this.mothersName = mothersName;
		this.fathersName = fathersName;
	}
	
	public OverloadedConstructorClass(String mothersName) {
		this.mothersName = mothersName;
	}
	
	

}
