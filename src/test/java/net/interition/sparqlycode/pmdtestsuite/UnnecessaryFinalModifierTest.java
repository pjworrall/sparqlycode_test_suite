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
public class UnnecessaryFinalModifierTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testFinalMethodModifier() throws Exception {
		// conventional Java test
		assertFalse("Failed to detect that a Final method should not be found in Final Class.",
				sparqlyCodeTest("pmdUnnecessaryFinalModifier"));
	}
}