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
public class MethodArgumentExerciseTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void doSomethingImportantTest() throws Exception {
		MethodArgumentExercise e = new MethodArgumentExercise();
		
		String song = e.doSomethingImportant("Cream", 3, new String[] {"Ginger","Bruce","Eric"});
		
		assertEquals("Whiteroom",song);
		
		// Sparqlycode test
		assertTrue("MethodArgumentExerciseTest encountered a problem with the sparqlycode RDF",
				 sparqlyCodeTest("MethodArgumentExerciseTest"));
	}
	
	@Test
	public void getNamesArrayReturnTypeTest() throws Exception {
		
		// Sparqlycode test
		assertTrue("ArrayReturnTypesTest encountered a problem with the sparqlycode RDF",
				 sparqlyCodeTest("ArrayReturnTypesTest"));
	}
	
	@Test
	public void getNamesArrayArgumentTest() throws Exception {
		
		// Sparqlycode test
		assertTrue("ArrayArgumentTest encountered a problem with the sparqlycode RDF",
				 sparqlyCodeTest("ArrayArgumentTest"));
	}

}
