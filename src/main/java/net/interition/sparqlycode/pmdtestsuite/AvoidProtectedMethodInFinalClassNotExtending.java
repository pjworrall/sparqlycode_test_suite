package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public final class AvoidProtectedMethodInFinalClassNotExtending {
// Comment out the following method to make the test fail.
	protected void thisMethodShouldntBeProtected () {
		
	}
	
	private int thisIsOK () {
		return 1;
	}
}

