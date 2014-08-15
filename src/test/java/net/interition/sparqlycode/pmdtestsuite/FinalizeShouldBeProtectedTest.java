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
public class FinalizeShouldBeProtectedTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testFinalizeProtected() throws Exception {
		// conventional Java test
		assertFalse("Non-protected instance of the 'finalize()' method found.",
				sparqlyCodeTest("pmdFinalizeShouldBeProtected"));
	}
}
