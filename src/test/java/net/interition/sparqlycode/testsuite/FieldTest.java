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
		assertTrue("uriLineNumberForFieldTest encountered a problem resolving lines numbers in the sparqlycode RDF",
				 sparqlyCodeTest("UriLineNumbersForFieldTest"));
	}
	
	@Test
	public void isNativeTest() throws Exception {
		
		// test the line number property exists and the uri is suffixed with the same number
		assertTrue("IsNativeTest encountered a problem resolving native methods in the sparqlycode RDF",
				 sparqlyCodeTest("IsNativeMethodTest"));
	}
	
	@Test
	public void fieldTypeTest() throws Exception {
		
		// test the line number property exists and the uri is suffixed with the same number
		assertTrue("FieldTypeTest encountered a problem resolving a fields type in the sparqlycode RDF",
				 sparqlyCodeTest("FieldTypeTest"));
	}

}
