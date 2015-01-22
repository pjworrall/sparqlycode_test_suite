Sparqlycode Test Suite
=============

SPARQLYCODE enables querying and linking of software artifacts, code, dependencies, build, configuration and source code management data using SPARQL.

This is an example of the test suite that Interition uses itself to test that concepts in published Knowledge Base are correctly reflected.

#### Java Concepts

The Sparqlycode KB Engine produces a Knowledge Base of Java code and its build configuration represented in the W3C RDF/OWL data schema.  This test suite has source code and other artefacts
manufactured to enable particular features in the KB to be tested. 

* The test suite is configured with the required Maven plugins to generate the KB 
* A simple, (with a lot of potential for improvement!), test framework allows SPARQL queries to be run against the KB
* The test suite uses the API and tools from [Apache Jena](https://jena.apache.org/) to run SPARQL queries 


#### Source Code Control Concepts

The SCCS KB Engine produces a Knowledge Base of the Source Code Control System history represented in the W3C RDF/OWL data schema and using the [W3C PROVO](http://www.w3.org/TR/prov-primer/) model
for Provenance.  For those not familiar with W3C PROVO an additional model is also available that uses the specific concepts and vocabulary of the SCCS used.

* [Git Ontology](http://www.interition.net/sparqlycode/vocabulary/git) TBD
* [Subversion Ontology](http://www.interition.net/sparqlycode/vocabulary/svn) TBD


#### Documentation

* [Sparqlycode KB installation guide](http://confluence.interition.net/todo)
* [SCCS KB installation guide](http://confluence.interition.net/todo)

#### Getting started

##### Required plugins

To actually create a Sparqlycode KB and SCCS KB (Git only at the moment) you do need the plugins. Otherwise you are just using the testsuite to
look at the queries and how we made a simple SPARQL test framework that runs in Junit: Btw that is useful in itself.  We are not very mature in
getting those plugins to you at the moment so watch this space.  If you desperately do want to try them get our help. We would have you up and
running quite quickly we just have not automated the setup yet

[Ask us to help](mailto:info@interiton.net)

##### Grab the testsuite project source

    git clone https://bitbucket.org/interition/sparqlycode-test-suite.git

##### Build it and create Eclipse project files

###### When using Maven

	mvn dependency:sources eclipse:eclipse package

#### Producing the Sparqlycode.ttl
    
    mvn javadoc:javadoc

#### Producing the Sccs.ttl

	mvn net.interition:screpo-maven-plugin:0.0.3-SNAPSHOT:screpo 

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

   Copyright 2014, 2015 Paul Worrall

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this software except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.