package net.interition.sparqlycode.pmdtestsuite;

public class FinalFieldCouldBeStatic {
	// Make the below field static to make the test pass.
	public final int thisShouldBeAStaticInt = 1;
	public static final int thisIsAlreadyStatic = 2;

}

