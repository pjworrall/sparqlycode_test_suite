package net.interition.sparqlycode.testsuite;

public class OverloadedMethodClass {
	
	private String mothersName;
	private String fathersName;
	private String brothersName;
	private String sistersName;
	
	
	public void setFamily(String mothersName, String fathersName, String brothersName ) {
		this.mothersName = mothersName;
		this.fathersName = fathersName;
		this.brothersName = brothersName;
	}
	
	public void setFamily(String mothersName, String fathersName) {
		this.mothersName = mothersName;
		this.fathersName = fathersName;
	}
	
	public void setFamily(String mothersName) {
		this.mothersName = mothersName;
	}
	
	

}
