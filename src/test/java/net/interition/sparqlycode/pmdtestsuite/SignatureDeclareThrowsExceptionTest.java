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
public class SignatureDeclareThrowsExceptionTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testExceptionThrowing() throws Exception {
		// conventional Java test
		assertFalse("Failed to detect Method that throws 'Exception'.",
				sparqlyCodeTest("pmdSignatureDeclareThrowsException"));
	}
}
