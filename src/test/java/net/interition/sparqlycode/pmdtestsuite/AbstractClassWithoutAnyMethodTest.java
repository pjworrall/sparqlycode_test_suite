package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;
import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

import org.junit.Before;
import org.junit.Test;

public class AbstractClassWithoutAnyMethodTest extends SparqlycodeBaseTest {
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
		public void testNoMethods() throws Exception {
			// conventional Java test
			assertTrue("No abstract class without methods found.",
					sparqlyCodeTest("pmdAbstractClassWithoutAnyMethod"));
		}
}
