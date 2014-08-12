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
public class ExcessivePublicFieldsTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testExcessivePublicFields() throws Exception {
		// conventional Java test
		assertTrue("Class method has over 10 public fields declared.",
				sparqlyCodeTest("pmdExcessivePublicFields"));
	}
}
