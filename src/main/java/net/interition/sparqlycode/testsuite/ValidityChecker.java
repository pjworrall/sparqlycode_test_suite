package net.interition.sparqlycode.testsuite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.jena.riot.RiotException;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class ValidityChecker {
	public static void main(String[] args) throws IOException {
	    Model model=ModelFactory.createDefaultModel();
	    model.read(new FileInputStream("src/test/resources/sparqlycode.ttl"),null,"TTL");
	}
}
