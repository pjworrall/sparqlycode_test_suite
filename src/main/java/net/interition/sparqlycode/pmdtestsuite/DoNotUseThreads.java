package net.interition.sparqlycode.pmdtestsuite;

public class DoNotUseThreads extends Thread {
	// According to J2EE, a class must not extend Thread or implement Runnable.
	// Remove the 'extends Thread' and the 'implements Runnable'
	// bits from the class signatures to make the test pass.
	
	private class RunnableImplementation implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}

