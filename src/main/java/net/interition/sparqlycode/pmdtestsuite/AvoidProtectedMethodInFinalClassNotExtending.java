package net.interition.sparqlycode.pmdtestsuite;

public final class AvoidProtectedMethodInFinalClassNotExtending {
// Comment out the following method to make the test pass.
	protected void thisMethodShouldntBeProtected () {
		
	}
	
	private int thisIsOK () {
		return 1;
	}
}

