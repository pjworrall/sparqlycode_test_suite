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
public class ExcessivePublicMethodsTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testExcessivePublicMethods() throws Exception {
		// conventional Java test
		assertTrue("Method in class has over 10 public methods declared.",
				sparqlyCodeTest("pmdExcessivePublicMethods"));
	}
}
