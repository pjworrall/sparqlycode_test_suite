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

/*
 * 
 * This Class is for testing concepts around methods
 * 
 */

public class MethodArgumentExercise {
	
	private String str;
	private int size;
	private String[] others;

	// example of an ordinary method declaration
	public String doSomethingImportant(String str, int size, String[] others) {
		this.str = str;
		this.size = size;
		this.others = others;
		
		return "Whiteroom";
	}
	
	public String[] getNames(String surnames[]) {
		String[] names = {"tom","dick","harry"};
		return names;
	}
}
