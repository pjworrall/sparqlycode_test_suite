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
public class MissingHashCodeTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testNoHashCode() throws Exception {
		// conventional Java test
		assertFalse("Failed to detect Class implementing 'equals(Object o)' but not 'hashCode()'.",
				sparqlyCodeTest("pmdMissingHashCode"));
	}
}