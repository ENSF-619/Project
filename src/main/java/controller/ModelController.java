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
	RequestHandler request;
	 public ModelController(RequestHandler request) {
		this.request=request;
		 
		 
	}

	@Override
	public String sendRequest(String msg) throws IOException {
		return request.checkRequest(msg);
	}



	
}
