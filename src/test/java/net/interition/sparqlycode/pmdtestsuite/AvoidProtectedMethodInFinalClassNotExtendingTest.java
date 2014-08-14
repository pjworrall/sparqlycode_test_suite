package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

public class AvoidProtectedMethodInFinalClassNotExtendingTest extends
		SparqlycodeBaseTest {
	
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
		public void testProtectedMethod() throws Exception {
			// conventional Java test
			assertFalse("Protected method found in a final class that doesn't extend any other classes.",
					sparqlyCodeTest("pmdAvoidProtectedMethodInFinalClassNotExtending"));
		}
}
