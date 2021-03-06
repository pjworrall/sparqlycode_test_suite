/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
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
		
		assertTrue("NonGenericToListTest encountered a problem with the sparqlycode RDF",
				sparqlyCodeTest("NonGenericToListTest"));
	}
	
	@Test
	public void genericToList() throws Exception {
		// conventional Java test
		List<String> bluesman = GenericMethodExercise.toList(new String[] {"Son","Robert","Rory","Eric"} );
		
		String firstname = bluesman.get(3);
		assertEquals("String[] to List<String> conversion",firstname,"Eric");
		
		// Test the generic methods declare the type variables in the method signature
		// Test an argument is declared as generic on the toList method
		assertTrue("GenericTypeDeclaredByMethod encountered a problem with the sparqlycode RDF",
				sparqlyCodeTest("GenericTypeDeclaredByMethodTest"));
		
		// Test an argument is declared as generic on the toList method
		assertTrue("GenericTypeArgumentTest encountered a problem with the sparqlycode RDF",
				sparqlyCodeTest("GenericTypeDeclaredByMethodTest"));
	}
	
	@Test
	public void genericReturnTypeTest() throws Exception {
		
		// tests that a staight return type is modelled correctly
		assertTrue("GenericReturnType encountered a problem with the sparqlycode RDF",
				sparqlyCodeTest("GenericReturnType"));
		
		// Test that a wildecard return type is modelled correctly
		assertTrue("GenericWildcardReturnType encountered a problem with the sparqlycode RDF",
				sparqlyCodeTest("GenericWildcardReturnType"));
	}
	
	@Test
	public void nonGenericMethodArgumentsTest() throws Exception {
		
		assertTrue("PlainOldStringMethodArgumentTest encountered a problem with the sparqlycode RDF",
				sparqlyCodeTest("PlainOldStringMethodArgumentTest"));
		
	}
	
	@Test
	public void typedMethodArgumentTest() throws Exception {
		
		assertTrue("Method argument for 'toList' should be generic type <T>",
				sparqlyCodeTest("GenericMethodArgumentType"));
		
	}

}
