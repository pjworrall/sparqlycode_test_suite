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
import java.util.List;

public class GenericMethodExercise {

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

	// two types
	// public static <A,B> void addAll(List<A> list, B... arr) {
	// for (B elt : arr ) list.add(elt);
	// }

}
