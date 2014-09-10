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
		
		// test that the java:name property is no longer created by the sc engine
		assertFalse("RemoveNameOnClassesTest encountered a name attibute on a Class in the sparqlycode RDF",
				 sparqlyCodeTest("RemoveNameOnClassesTest"));
	}

}
