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
			assertTrue("Abstract class found no prefix 'Abstract' in the class name.",
					sparqlyCodeTest("pmdAbstractNaming"));
		}
}
