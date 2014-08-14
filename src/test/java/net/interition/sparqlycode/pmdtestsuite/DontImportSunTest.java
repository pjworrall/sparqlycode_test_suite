package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;
/**
 * @author Adam Nogradi, Interition Ltd
 *
 */
public class DontImportSunTest  extends SparqlycodeBaseTest{
	

			/**
			 * @throws java.lang.Exception
			 */
			@Before
			public void setUp() throws Exception {
				super.setUp();
			}
			
			@Test
			public void sunImportTest() throws Exception {
				// conventional Java test
				assertFalse("Class imports a Sun package.",
						sparqlyCodeTest("pmdDontImportSun"));
			}
}
