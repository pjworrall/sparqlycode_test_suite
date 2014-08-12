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
public class JUnit4TestShouldUseTestAnnotationTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void jUnitUsingTestAnnotationTest() throws Exception {
		// conventional Java test
		assertTrue("A method prefixed with the word 'test' was found that is not using the '@Test' annotation.",
				sparqlyCodeTest("pmdJUnit4TestShouldUseTestAnnotation"));
	}
}
