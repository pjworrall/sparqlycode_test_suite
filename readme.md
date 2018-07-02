Sparqlycode Test Suite
=============

SPARQLYCODE enables querying and linking of software artifacts, code, dependencies, build, configuration and source code management data using SPARQL.

This is an example of the test suite that Interition uses itself to test that concepts in published Knowledge Base are correctly reflected.

#### CODE KB - Java 

The CODE KB Engine produces a Knowledge Base of Java code represented in the W3C RDF/OWL data schema.  This test suite has source code and other artefacts
manufactured to enable particular features in the KB to be tested. 

* The test suite is configured with the required Maven plugins to generate the KB 
* A simple, (with a lot of potential for improvement!), test framework allows SPARQL queries to be run against the KB
* The test suite uses the API and tools from [Apache Jena](https://jena.apache.org/) to run SPARQL queries 


#### SCCS KB - Source Code Control System 

The SCCS KB Engine produces a Knowledge Base of the Source Code Control System history represented in the W3C RDF/OWL data schema and using the [W3C PROVO](http://www.w3.org/TR/prov-primer/) model
for Provenance.  For those not familiar with W3C PROVO an additional model is also available that uses the specific concepts and vocabulary of the SCCS used.

* [Git Ontology](http://www.interition.net/sparqlycode/vocabulary/git) TBD
* [Subversion Ontology](http://www.interition.net/sparqlycode/vocabulary/svn) TBD

#### BUILD KB - Maven build

The BUILD KB Engine produces a Knowledge Base of a Maven Project Object Model (POM). The BUILD KB Engine is currently not a Maven plugin and is executed from a shell script. Therefore this is not yet available in the test suite.


#### Documentation

* [Maven configuration guide](https://confluence.interition.net/display/SPAR/Maven+Configuration)

#### Getting started

##### Required plugins

To run the tests and explore the test suite KB we have provided the latest test suite KB on our confluence site.

* [Test suite KB] (https://confluence.interition.net/display/SPAR/Test+Suite+KB)

To actually create the KB you do need the plugins. Otherwise you are just using the testsuite to
look at the queries and how we made a simple SPARQL test framework that runs in Junit: Btw that is useful in itself.  We are not very mature in
getting those plugins to you at the moment so watch this space. 

[Ask us to help](mailto:info@interiton.net)

##### Grab the testsuite project source

    git clone https://bitbucket.org/interition/sparqlycode-test-suite.git

##### Build it and create Eclipse project files

###### When using Maven

	mvn dependency:sources eclipse:eclipse package

#### Producing the CODE KB
    
        mvn generate-sources -Ppublish-code-kb

#### Producing the SCCS KB

        mvn generate-sources -Ppublish-gito-sccs-kb


#### Skipping tests

If those darn tests are stopping you add this argument to the mvn command

	-Dmaven.test.skip=true
    
#### Running SPARQL queries from a unix shell with Jena ARQ

	arq --data=${yourlocation}/sparqlycode.ttl --file=${mavenBuildDir}/src/test/resources/sparqlycode/query.rq
	
#### Using the SPARQL Junit framework in your own code

To run SPARQL queries as JUnit tests that get reported by Maven Surefire Plugin etc there is an abstract class you can extend called SparqlycodeBaseTest.
To use that class put the testsuite in your local Maven repository:

	mvn install:install
	
Declare your use of it in your POM:

		<dependency>
			<groupId>net.interition</groupId>
			<artifactId>testsuite</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<scope>test</scope>
		</dependency>

Then extend it in your JUnit test classes:

	package net.interition;
	
	import static org.junit.Assert.*;
	import net.interition.sparqlycode.testsuite.SparqlycodeBaseTest;
	
	import org.junit.Test;
	
	public class ExampleSparqlTestCase extends SparqlycodeBaseTest {
	
		@Test
		public void test() {
			fail("Not yet implemented");
		}
	
	}		
 
 Note it will need Apache Jena as a dependency:
 
 		<dependency>
			<groupId>org.apache.jena</groupId>
			<artifactId>apache-jena-libs</artifactId>
			<type>pom</type>
			<version>2.11.2</version>
			<scope>test</scope>
		</dependency>
		
.. and maybe a few others. Explore the test suite to snatch the config. and contribute the improved instructions here!

#### Thanks to

Adam Nogradi, undergraduate at the University of Manchester, for his help, support and enthusiasm with this project. 
    
#### Licensing

Apache License Version 2.0
