package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.assertFalse;
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
	public void testJUnitUsingTestAnnotation() throws Exception {
		// conventional Java test
		assertFalse("Failed to discover a method prefixed with the word 'test' that is not using the '@Test' annotation.",
				sparqlyCodeTest("pmdJUnit4TestShouldUseTestAnnotation"));
	}
}
