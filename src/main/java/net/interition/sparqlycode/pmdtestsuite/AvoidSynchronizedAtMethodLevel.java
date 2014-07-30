package net.interition.sparqlycode.pmdtestsuite;

public class AvoidSynchronizedAtMethodLevel {
	synchronized void thisMethodShouldntBeSynchronized () {
		// use block-level synchronization instead.
	}
}

