package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;

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
			public void testSunImport() throws Exception {
				// conventional Java test
				assertTrue("Class imports a Sun package.",
						sparqlyCodeTest("pmdDontImportSun"));
			}
}
