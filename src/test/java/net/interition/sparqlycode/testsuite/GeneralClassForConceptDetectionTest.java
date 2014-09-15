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
public class GeneralClassForConceptDetectionTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void areConstructorsTyped() throws Exception {

		assertTrue("ConstructorsHaveType encountered a problem finding Type properties for constructors in the sparqlycode RDF",
				sparqlyCodeTest("ConstructorsHaveType"));
	}
	
	@Test
	public void areMethodTyped() throws Exception {

		assertTrue("MethodsHaveType encountered a problem finding Type properties for constructors in the sparqlycode RDF",
				sparqlyCodeTest("MethodsHaveType"));
	}
	
	@Test
	public void doConstructoresHaveSamePropertiesAsMethods() throws Exception {

		assertTrue("ConstructorsHaveSamePropertiesAsMethods encountered a problem checking constructors properties in the sparqlycode RDF",
				sparqlyCodeTest("ConstructorsHaveSamePropertiesAsMethods"));
	}
	

}
