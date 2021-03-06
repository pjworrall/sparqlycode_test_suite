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
 * This Class is for exercising Sparqlycode RDF generation from Java Generics
 * 
 * It is based on example code in Java Generics and Collections O'Reilly Natlin and Wadler
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethodExercise {
	
	List<Number> genericField= null;

	// bring old fashioned raw type
	public static String toList(String what){
		return "it";
	}
	
	
	// example of an ordinary method declaration
	public static List<String> toList(String[] arr) {
		List<String> list = new ArrayList<String>();
		for (String elt : arr)
			list.add(elt);
		return list;
	}

	// a generics based method
	public static <T> List<T> toList(T[] arr) {
		List<T> list = new ArrayList<T>();

		for (T elt : arr)
			list.add(elt);
		return list;
	}

	// Extending the generics one with varargs for convenience
	// the method name has been distinguished otherwise it would have exactly
	// the same "erasure" as the original
	// generics method
	public static <T> List<T> toListWithVarArgs(T... arr) {
		List<T> list = new ArrayList<T>();

		for (T elt : arr)
			list.add(elt);
		return list;
	}

	// any number of arguments may proceed the last varargs
	public static <T> void addAll(List<T> list, T... arr) {
		for (T elt : arr)
			list.add(elt);
	}

	// a bound type variable
	public static <T extends AClassToBeExtended> void addBoundAll(List<T> list, T... arr) {
		for (T elt : arr)
			list.add(elt);
	}

	// a generics based method
	public static <T> List<T> toAnotherList(T[] arr) {
		List<T> list = new ArrayList<T>();

		for (T elt : arr)
			list.add(elt);
		return list;
	}

	// a generic method with an argument bound by a subtype
	public List<Number> subtyped(List<? extends Number> arr) {
		List<Number> list = new ArrayList<Number>();
		for (Number elt : arr)
			list.add(elt);
		return list;
	}

	public Map<? extends String, ? extends Number> wildecardReturn(String key,
			String value) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Poo", new Double(10.99));
		return map;
	}
	
	public Map<String, String> myMethod(Map<String, Integer> map)  {
		 Map<String, String> myMap= new HashMap<String, String> ();
		 return myMap;
	}

	// two types
	// public static <A,B> void addAll(List<A> list, B... arr) {
	// for (B elt : arr ) list.add(elt);
	// }

}
