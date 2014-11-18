package net.interition.sparqlycode.testsuite;

/**
 * 
 * @author Paul Worrall, Interition Ltd.
 *
 */

public class GeneralClassForConceptDetection {
	
	private boolean sheDoes = true;
	private boolean sheDoesNot = false;
	
	GeneralClassForConceptDetection() {
		this.sheDoes = true;
		this.sheDoesNot = false;
	}
	
	public boolean isSheDoesNot() {
		return sheDoesNot;
	}
	public void setSheDoesNot(boolean sheDoesNot) {
		this.sheDoesNot = sheDoesNot;
	}
	public boolean isSheDoes() {
		return sheDoes;
	}
	public void setSheDoes(boolean sheDoes) {
		this.sheDoes = sheDoes;
	}

}
