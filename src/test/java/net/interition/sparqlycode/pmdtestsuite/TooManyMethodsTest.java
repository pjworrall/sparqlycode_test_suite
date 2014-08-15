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
public class TooManyMethodsTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testTooManyMethods() throws Exception {
		// conventional Java test
		assertFalse("Failed to detect that a Class should not have over 10 methods.",
				sparqlyCodeTest("pmdTooManyMethods"));
	}
}