package net.interition.sparqlycode.pmdtestsuite;

public final class AvoidProtectedMethodInFinalClassNotExtending {
	protected void thisMethodShouldntBeProtected () {
		
	}
	
	private int thisIsOK () {
		return 1;
	}
}

