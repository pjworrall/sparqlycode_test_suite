package net.interition.sparqlycode.pmdtestsuite;

public class MissingStaticMethodInNonInstantiatableClass {	

	// This class is unusable, since it cannot be
	// instantiated (private constructor),
	// and no static method can be called.

	  private MissingStaticMethodInNonInstantiatableClass(int x) {
		  
	  }
	  
	  void missingStaticMethodInNonInstantiatableClass() {}
	
}
