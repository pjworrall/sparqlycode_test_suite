package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi and Paul Worrall, Interition Ltd.
 *
 */
public class CloneImplementorCorrect implements Cloneable {
	
	    public Object clone() throws CloneNotSupportedException{
	        return super.clone();
	    }
	
}
