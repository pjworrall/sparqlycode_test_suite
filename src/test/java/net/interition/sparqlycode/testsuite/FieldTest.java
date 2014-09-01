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
public class FieldTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void uriLineNumberForFieldTest() throws Exception {
		
		// test the line number property exists and the uri is suffixed with the same number
		assertTrue("uriLineNumberForFieldTest encountered a problem with the sparqlycode RDF",
				 sparqlyCodeTest("UriLineNumbersForFieldTest"));
	}

}
