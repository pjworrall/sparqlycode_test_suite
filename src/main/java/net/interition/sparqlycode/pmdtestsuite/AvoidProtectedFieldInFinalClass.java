package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public final class AvoidProtectedFieldInFinalClass {
	// Comment out the following field to make the test fail.
	protected int thisShouldntBeProtected = 1;
	int packagePrivateInt = 2;
	private int privateInt = 3;
}

