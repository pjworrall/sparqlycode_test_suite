package net.interition.sparqlycode.pmdtestsuite;

public class DoNotExtendJavaLangError extends Error {
	// A class should not extend Java.lang.Error as that
	// is for system exceptions.
	// Remove the 'extends Error' bit from the class signature
	// to make the test pass.
}

