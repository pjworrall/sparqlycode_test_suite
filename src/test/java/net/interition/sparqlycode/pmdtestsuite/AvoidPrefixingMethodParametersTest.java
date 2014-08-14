package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;
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
		public void methodArgumentsPrefixedTest() throws Exception {
			// conventional Java test
			assertFalse("Prefixed method arguments found.",
					sparqlyCodeTest("pmdAvoidPrefixingMethodParameters"));
		}
}
