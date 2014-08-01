package net.interition.sparqlycode.testsuite;

import java.io.FileInputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * 
 * @author Paul Worrall
 * 
 */
public class SparqlycodeBaseTest {
	
	protected transient final Log log = LogFactory.getLog(getClass());

	protected Model model;

	private String sparqlyQueryExt = ".rq";
	private String sparqlyQueryFolder = "/sparqlycode/";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		this.model = ModelFactory.createDefaultModel();
		
		URL kb = this.getClass().getResource("/sparqlycode.ttl");
		log.debug("file url was: " + kb) ;
		model.read(kb.toString());

	}
	
	public boolean ask(String query) {

 	    Query sparqlQuery = QueryFactory.create(query) ;
 	
		QueryExecution qexec = QueryExecutionFactory.create(sparqlQuery, model) ;
		boolean result = qexec.execAsk() ;
		qexec.close() ;
		
		return result;
		}
	
	public String getQuery(String name) throws Exception {
		
		String filename = sparqlyQueryFolder + name + sparqlyQueryExt;

		URL url = this.getClass().getResource(filename);
		
		if(url == null) log.debug("sparql query file [" + filename + "] not found on classpath" );

		String query = null ;
		FileInputStream inputStream = new FileInputStream(url.getPath());
		try {
			query = IOUtils.toString(inputStream);
		} finally {
			inputStream.close();
		}
		
		return query;
		
	}

}