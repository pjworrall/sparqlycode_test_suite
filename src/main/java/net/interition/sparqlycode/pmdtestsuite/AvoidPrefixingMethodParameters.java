package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class AvoidPrefixingMethodParameters {
	// Remove the 'in' and 'out' prefixes from the method argument names to make the test fail.
	public void aMethod (int inParameter, int inParameter2, String outParameter) {
		
	}
	
	public void anotherMethod (int outData1, int outData2) {
		
	}
}

