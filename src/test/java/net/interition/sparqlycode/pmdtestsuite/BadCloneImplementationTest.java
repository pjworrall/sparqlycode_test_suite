package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

public class BadCloneImplementationTest extends SparqlycodeBaseTest {
	
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
		public void testBadCloneImplementation() throws Exception {
			// conventional Java test
			assertTrue("Could not detect a Class that has a 'clone()' method without implementing the Cloneable interface.",
					sparqlyCodeTest("pmdCloneImplementorMissingCloneableInterface"));
		}
}
