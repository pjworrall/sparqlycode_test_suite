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
		public void noMethodsTest() throws Exception {
			// conventional Java test
			assertTrue("Abstract class with no methods found.",
					sparqlyCodeTest("pmdAbstractClassWithoutAnyMethod"));
		}
}
