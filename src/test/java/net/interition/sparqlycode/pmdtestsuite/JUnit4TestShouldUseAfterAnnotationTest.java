package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class JUnit4TestShouldUseAfterAnnotationTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void jUnitUsingAfterAnnotation() throws Exception {
		// conventional Java test
		assertTrue("Method 'tearDown()' found with no '@After' annotation.",
				sparqlyCodeTest("pmdJUnit4TestShouldUseAfterAnnotation"));
	}
}
