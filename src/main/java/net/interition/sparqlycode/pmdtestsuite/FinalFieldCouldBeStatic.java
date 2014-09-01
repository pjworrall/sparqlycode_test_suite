package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class FinalFieldCouldBeStatic {
	// Remove the 'static' modifier from the below field to make the test fail.
	public static final int thisShouldBeAStaticInt = 1;
	public static final int thisIsAlreadyStatic = 2;

}

