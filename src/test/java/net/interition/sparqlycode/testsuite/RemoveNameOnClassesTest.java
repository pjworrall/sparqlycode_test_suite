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
public class RemoveNameOnClassesTest extends SparqlycodeBaseTest {

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
		assertFalse("RemoveNameOnClassesTest encountered a name attibute on a Class in the sparqlycode RDF",
				 sparqlyCodeTest("RemoveNameOnClassesTest"));
	}

}
