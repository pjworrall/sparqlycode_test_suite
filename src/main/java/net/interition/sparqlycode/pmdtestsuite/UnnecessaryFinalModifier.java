package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public final class UnnecessaryFinalModifier {
	// Remove the 'final' declaration from the below signature to make the test fail.
	public final void thisMethodDoesntHaveToBeFinal () {
	}
}

