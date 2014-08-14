package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Paul Worrall & Adam Nogradi, Interition Ltd.
 *
 */
public class MissingHashCode { // poor, missing a hashcode() method
	
	public boolean equals(Object o) {
	      // do some comparison
		return true;
		}
	// Uncomment the following method to make the test pass.
//	public int hashCode() {
//	      // return some hash value
//			return 1;
//		}
}
