/**
 * 
 */
package net.interition.sparqlycode.testsuite;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Paul Worrall, Interition Ltd
 *
 */
public class DeprecatedMethodsTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void deprecatedMethodTest() throws Exception {
		
		// Sparqlycode test
		assertTrue("deprecatedMethodTest encountered a problem with the sparqlycode RDF",
				 sparqlyCodeTest("DeprecatedMethodsTest"));
	}

}
