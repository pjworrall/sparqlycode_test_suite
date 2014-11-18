package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Paul Worrall, Interition Ltd.
 *
 */

public class MissingStaticMethodInNonInstantiatableClass {	

	// This class is unusable, since it cannot be
	// instantiated (private constructor),
	// and no static method can be called.

	  private MissingStaticMethodInNonInstantiatableClass(int x) {
		  
	  }
	  // Make the below method static to make the test fail
	  void missingStaticMethodInNonInstantiatableClass() {}
	
}
