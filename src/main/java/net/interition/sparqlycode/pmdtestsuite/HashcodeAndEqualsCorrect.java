package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class HashcodeAndEqualsCorrect  {
	//perfect, both methods provided
		public boolean equals(Object other) {
	      // do some comparison
			return true;
		}
		public int hashCode() {
	      // return some hash value
			return 1;
		}
}
