package net.interition.sparqlycode.pmdtestsuite;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class DoNotUseThreads extends Thread {
	// According to J2EE, a class must not extend Thread or implement Runnable.
	// Remove the 'extends Thread' and the 'implements Runnable'
	// bits from the class signatures to make the test fail.
	
	private class RunnableImplementation implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}

