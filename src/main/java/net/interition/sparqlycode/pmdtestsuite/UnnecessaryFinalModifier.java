package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public final class UnnecessaryFinalModifier {
	// Remove the 'final' declaration from the below signature to make the test pass.
	public final void thisMethodDoesntHaveToBeFinal () {
	}
}

