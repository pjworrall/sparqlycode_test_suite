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
public class OverloadedMethodClassTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void numberOfMethodsUnexpected() throws Exception {
		assertTrue("OverloadedMethodClassTest had unexpected number of methods",
				sparqlyCodeTest("OverloadedMethodClassTest"));
	}

}
