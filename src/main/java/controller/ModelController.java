package controller;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class will communicate with JDBC gets JSON files and create Local Model
 * Also This Class communicates with View Controller and handles any requests from viewController
 * @author zchem
 *
 */
public class ModelController implements Observer {
	/**
	 * Add methods or class to differentiate between requests
	 * @param request
	 * @return
	 */
	public String requestHandeler(String request) {
		ObjectMapper mapper=new ObjectMapper();
		JsonNode node = null;
		 try {
			 node = mapper.readTree(request);
			 System.err.println(node.asText());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if( node.get("Type").asText().equals("GET"))
			return "yes";
		return "NONE";
	}

	public String update(String request) {
		System.out.println("HERE");
		return requestHandeler(request);
	}

	
}
