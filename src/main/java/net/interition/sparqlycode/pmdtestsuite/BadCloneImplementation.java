package net.interition.sparqlycode.pmdtestsuite;

public class BadCloneImplementation {
	// implement the 'Cloneable' interface to make the test fail.
	
	    public BadCloneImplementation clone(){
	        return new BadCloneImplementation(); // This is bad
	    }
	
}
