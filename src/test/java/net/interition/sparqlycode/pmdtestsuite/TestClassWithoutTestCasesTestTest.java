package net.interition.sparqlycode.pmdtestsuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;

/**
 * 
 * @author Adam Nogradi, Interition Ltd.
 *
 */
public class TestClassWithoutTestCasesTestTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testNoTestCases() throws Exception {
		// conventional Java test
		assertFalse("Failed to detect Class name suffixed with 'Test' having no test cases.",
				sparqlyCodeTest("pmdTestClassWithoutTestCases"));
	}
}
