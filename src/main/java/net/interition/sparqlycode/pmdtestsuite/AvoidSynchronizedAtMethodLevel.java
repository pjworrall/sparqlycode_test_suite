package net.interition.sparqlycode.pmdtestsuite;

public class AvoidSynchronizedAtMethodLevel {
	// Remove the 'synchronized' keyword from the below method  to
	// make the test fail.
	synchronized void thisMethodShouldntBeSynchronized () {
		// use block-level synchronization instead.
	}
}

