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
 
 
 package net.interition.sparqlycode.testsuite;

/**
 * @author Paul Worrall, Interition Ltd
 *
 */

public class OverloadedConstructorClass {
	
	private String mothersName;
	private String fathersName;
	private String brothersName;
	private String sistersName;
	
	
	public OverloadedConstructorClass(String mothersName, String fathersName, String brothersName ) {
		this.mothersName = mothersName;
		this.fathersName = fathersName;
		this.brothersName = brothersName;
	}
	
	public OverloadedConstructorClass(String mothersName, String fathersName) {
		this.mothersName = mothersName;
		this.fathersName = fathersName;
	}
	
	public OverloadedConstructorClass(String mothersName) {
		this.mothersName = mothersName;
	}
	
	

}
