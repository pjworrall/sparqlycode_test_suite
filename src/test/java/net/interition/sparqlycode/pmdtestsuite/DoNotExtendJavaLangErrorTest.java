package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

public class DoNotExtendJavaLangErrorTest extends SparqlycodeBaseTest {
	
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
		public void testExtendingError() throws Exception {
			// conventional Java test
			assertFalse("Class found that extends java.lang.Error.",
					sparqlyCodeTest("pmdDoNotExtendJavaLangError"));
		}
}
