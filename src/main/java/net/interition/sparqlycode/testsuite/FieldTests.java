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
 * 
 * @author Paul Worrall, Interition Ltd.
 *
 */
public class FieldTests {
	// this field must be on line number 10 for its test to pass
	public static final int testField = 0;
	
	static {
		System.loadLibrary ("native");
	}

	private static int[] ages = { 10, 20 , 30 ,40, 50, 50}; 
	private static int[] height = new int[10];
	private String[][] names = {{"Tom","Mo"},
			{"Curtis", "Morris"}
	};

	public String sayHello() {
		return "nowt";
	}

	// native allows us to find code that might call out to other libraries outside the control of the JVM
	public native String externalCode() ;

}
