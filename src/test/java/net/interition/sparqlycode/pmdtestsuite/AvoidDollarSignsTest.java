package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

public class AvoidDollarSignsTest extends SparqlycodeBaseTest{
	
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
		public void testDollarSignInClassName() throws Exception {
			// conventional Java test
			assertTrue("'$' sign in the class name",
					sparqlyCodeTest("pmdAvoid$Signs_class"));
		}
		
		@Test
		public void testDollarSignInInterfaceName() throws Exception {
			// conventional Java test
			assertTrue("'$' sign in the interface name",
					sparqlyCodeTest("pmdAvoid$Signs_interface"));
		}
}
