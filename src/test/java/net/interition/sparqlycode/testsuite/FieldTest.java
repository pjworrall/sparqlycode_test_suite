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
	
	@Test
	public void genericFieldTest() throws Exception {
		
		// test that fields with generic types and parameters have appropriate properties
		assertTrue("GenericFieldTest did not find expected properties for a generic field in the sparqlycode RDF",
				 sparqlyCodeTest("GenericFieldTest"));
	}
	
	@Test
	public void independentParameterTypesTest() throws Exception {
		
		// test that fields with generic types and parameters have appropriate properties
		assertTrue("IndependentParameterTypesTest did not find expected properties for a generic field in the sparqlycode RDF",
				 sparqlyCodeTest("IndependentParameterTypesTest"));
	}
	
	@Test
	public void fieldIsArrayTest() throws Exception {
		
		// test that fields that are arrays have java:dimension properties
		assertTrue("FieldIsArrayTest did not find expected properties for an Array in the sparqlycode RDF",
				 sparqlyCodeTest("FieldIsArrayTest"));
	}

}
