package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public interface AvoidConstantsInterface {
	public static final int badConstant1 = 1;
	public static final String badConstant2 = "Baaaad constant in an interface!";
	
	// Uncomment the below method to make the test fail.
//	public void notConstantsOnly ();
}

