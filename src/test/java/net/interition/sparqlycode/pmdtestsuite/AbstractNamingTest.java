package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

public class AbstractNamingTest extends SparqlycodeBaseTest {
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
		public void testAbstractClassNaming() throws Exception {
			// conventional Java test
			assertTrue("No abstract class found that does not have the 'Abstract' prefix in its class name.",
					sparqlyCodeTest("pmdAbstractNaming"));
		}
}
