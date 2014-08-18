package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public abstract class AbstractClassWithoutAbstractMethod {
	
	public void doStuff () {
		int i = 1;
		i++;
		System.out.println(i);
	}
	
	// Uncomment the below line to make the test fail.
//		public abstract void doMoreStuff (int anInt);
}

