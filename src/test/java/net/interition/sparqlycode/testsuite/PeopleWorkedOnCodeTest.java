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

import java.io.IOException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * @author Paul Worrall, Interition Ltd
 *
 */
public class PeopleWorkedOnCodeTest extends SparqlycodeBaseTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		this.model = ModelFactory.createDefaultModel();
		
		URL kb = this.getClass().getResource("/sccs.ttl");
		
		if(kb == null) throw new IOException("SCCS KB not found. Have you produced it yet?");
		
		model.read(kb.toString());

	}
	
	@Test
	public void uriLineNumberForFieldTest() throws Exception {
		
		// test that the java:name property is no longer created by the sc engine
		assertFalse("PeopleWorkedOnCodeTest didn't find any people information",
				 sparqlyCodeTest("PeopleWorkedOnCodeTest"));
	}

}
