package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public abstract class AbstractClassWithoutAnyMethod {
	protected int anInt = 1;
	
	public AbstractClassWithoutAnyMethod (int a) {
		anInt = a;
	}
	
// Uncomment the following method to make the test fail.
//	private void stuff () {
//		int i = 0;
//	}
}
