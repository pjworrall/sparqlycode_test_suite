package net.interition.sparqlycode.pmdtestsuite;

public final class UnnecessaryFinalModifier {
	public final void thisMethodDoesntHaveToBeFinal () {
		// Class is already final, making all the methods final implicitly
	}
}

