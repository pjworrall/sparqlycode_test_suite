package net.interition.sparqlycode.pmdtestsuite;

public class DoNotUseThreads extends Thread {
	// According to J2EE, a class must not extend Thread or implement Runnable.

	
	private class RunnableImplementation implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}

