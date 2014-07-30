package net.interition.sparqlycode.pmdtestsuite;

public class BadCloneImplementation {
	
	    public BadCloneImplementation clone(){
	        return new BadCloneImplementation(); // This is bad
	    }
	
}
