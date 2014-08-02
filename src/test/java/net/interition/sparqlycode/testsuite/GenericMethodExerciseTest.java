/**
 * 
 */
package net.interition.sparqlycode.testsuite;

import static org.junit.Assert.*;

import java.util.List;

import net.interition.sparqlycode.testsuite.GenericMethodExercise;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Paul Worrall, Interition Ltd
 *
 */
public class GenericMethodExerciseTest extends SparqlycodeBaseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void nonGenericToList() throws Exception {
		// conventional Java test
		List<String> bluesman = GenericMethodExercise.toList(new String[] {"Son","Robert","Rory","Eric"} );
		
		String firstname = bluesman.get(2);
		assertEquals("String[] to List<String> conversion",firstname,"Rory");
		
		// Sparqlycode test
		String query = getQuery("NonGenericToListTest");
		assertTrue("NonGenericToListTest encountered a problem with the sparqlycode RDF",ask(query));
	}
	
	@Test
	public void genericToList() throws Exception {
		// conventional Java test
		List<String> bluesman = GenericMethodExercise.toList(new String[] {"Son","Robert","Rory","Eric"} );
		
		String firstname = bluesman.get(3);
		assertEquals("String[] to List<String> conversion",firstname,"Eric");
		
		String query = null;
		// Test the generic methods declare the type variables in the method signature
		// Test an argument is declared as generic on the toList method
		query = getQuery("GenericTypeDeclaredByMethodTest");
		assertTrue("GenericTypeDeclaredByMethod encountered a problem with the sparqlycode RDF",ask(query));
		
		// Test an argument is declared as generic on the toList method
		query = getQuery("GenericTypeArgumentTest");
		assertTrue("GenericTypeArgumentTest encountered a problem with the sparqlycode RDF",ask(query));
	}

}
