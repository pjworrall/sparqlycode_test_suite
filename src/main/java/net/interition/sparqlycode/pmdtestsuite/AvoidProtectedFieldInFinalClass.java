package net.interition.sparqlycode.pmdtestsuite;

public final class AvoidProtectedFieldInFinalClass {
	protected int thisShouldntBeProtected = 1;
	int packagePrivateInt = 2;
	private int privateInt = 3;
}

