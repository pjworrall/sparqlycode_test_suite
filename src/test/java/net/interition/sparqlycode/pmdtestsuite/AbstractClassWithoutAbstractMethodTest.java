package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;
import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

import org.junit.Before;
import org.junit.Test;

public class AbstractClassWithoutAbstractMethodTest extends SparqlycodeBaseTest {
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
		public void doStuffTest() throws Exception {
			// conventional Java test
			assertFalse("Abstract class with no abstract methods found.",
					sparqlyCodeTest("pmdAbstractClassWithoutAbstractMethod"));
		}
}
