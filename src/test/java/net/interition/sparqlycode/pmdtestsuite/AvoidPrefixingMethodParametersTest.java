package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;
import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

import org.junit.Before;
import org.junit.Test;

public class AvoidPrefixingMethodParametersTest extends SparqlycodeBaseTest {
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
		public void testMethodArgumentsPrefixed() throws Exception {
			// conventional Java test
			assertTrue("No method with prefixed arguments found.",
					sparqlyCodeTest("pmdAvoidPrefixingMethodParameters"));
		}
}
