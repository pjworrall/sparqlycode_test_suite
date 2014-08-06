package net.interition.sparqlycode.pmdtestsuite;

public abstract class AbstractClassWithoutAbstractMethod {
	
	public void doStuff () {
		int i = 1;
		i++;
		System.out.println(i);
	}
	
	// Uncomment the below line to make the test pass.
	//	public abstract void doMoreStuff (int anInt);
}

