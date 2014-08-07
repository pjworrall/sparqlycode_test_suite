package net.interition.sparqlycode.pmdtestsuite;

public final class AvoidProtectedFieldInFinalClass {
	// Comment out the following field to make the test pass.
	protected int thisShouldntBeProtected = 1;
	int packagePrivateInt = 2;
	private int privateInt = 3;
}

