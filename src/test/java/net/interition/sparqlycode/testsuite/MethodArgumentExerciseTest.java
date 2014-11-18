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
