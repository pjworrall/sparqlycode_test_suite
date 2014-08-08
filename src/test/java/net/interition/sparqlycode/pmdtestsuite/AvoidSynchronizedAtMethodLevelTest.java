package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

public class AvoidSynchronizedAtMethodLevelTest extends SparqlycodeBaseTest {
	
	/**
	 * @author Adam Nogradi, Interition Ltd
	 *
	 */

		/**
		 * @throws java.lang.Exception
		 */
		@Before
		public void setUp() throws Exception {
			super.setUp();
		}
		
		@Test
		public void synchronizedMethodTest() throws Exception {
			// conventional Java test
			assertTrue("Synchronized method found. Use 'synchronized' on a block level.",
					sparqlyCodeTest("pmdAvoidSynchronizedAtMethodLevel"));
		}
}
