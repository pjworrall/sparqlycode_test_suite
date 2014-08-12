package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class MethodNamingConventions {
	// Comment out the following 3 methods to make the test pass.
	public void UpperCaseMethod () {
		
	}
	
	private String method_with_underscores () {
		return "Not a good naming convention";
	}
	
	protected void Method_with_both_bad_conventions () {
		
	}
	
	public int goodMethod () {
		return 2;
	}
}

