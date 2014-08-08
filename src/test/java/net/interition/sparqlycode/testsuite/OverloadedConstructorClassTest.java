package net.interition.sparqlycode.testsuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
/**
 * @author Adam Nogradi, Interition Ltd
 *
 */
public class OverloadedConstructorClassTest extends SparqlycodeBaseTest {

		/**
		 * @throws java.lang.Exception
		 */
		@Before
		public void setUp() throws Exception {
			super.setUp();
		}
		
		@Test
		public void overloadedConstructorTest() throws Exception {
			assertTrue("OverloadedConstructorClassTest had unexpected number of constructors",
					sparqlyCodeTest("OverloadedConstructorClassTest"));
		}
}
