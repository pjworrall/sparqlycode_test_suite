package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;

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
		public void badCloneImplementationTest() throws Exception {
			// conventional Java test
			assertFalse("Bad implementation of the 'clone' method was found. Extend the 'Cloneable' interface.",
					sparqlyCodeTest("pmdCloneImplementorMissingCloneableInterface"));
		}
}
