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
public class EnumsShouldNotBeMarkedAsClassesTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void enumShouldNotBeMarkedAsAClass() throws Exception {
		
		// test Enums are only marked as Enum types and not as Classes as well
		assertFalse("EnumsShouldNotBeMarkedAsClassesTest encountered a problem in the sparqlycode RDF",
				 sparqlyCodeTest("EnumsShouldNotBeMarkedAsClassesTest"));
	}

}
