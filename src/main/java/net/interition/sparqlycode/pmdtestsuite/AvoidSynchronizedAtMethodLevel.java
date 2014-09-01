package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class AvoidSynchronizedAtMethodLevel {
	// Remove the 'synchronized' keyword from the below method  to
	// make the test fail.
	synchronized void thisMethodShouldntBeSynchronized () {
		// use block-level synchronization instead.
	}
}

