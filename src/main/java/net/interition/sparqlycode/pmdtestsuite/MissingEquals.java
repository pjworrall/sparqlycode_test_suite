package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Paul Worrall & Adam Nogradi, Interition Ltd.
 *
 */
public class MissingEquals { // poor, missing a equals() method
	
	public int hashCode() {
	      // return some hash value
			return 1;
		}
	// Uncomment the below method to make the test pass.
//	public boolean equals(Object o) {
//	      // do some comparison
//		return true;
//		}
}
