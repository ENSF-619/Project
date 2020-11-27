package controller;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class RequestHandler {
	String request;
	boolean status;
	private Response response;
	ObjectMapper mapper;
	JsonNode node;
public RequestHandler(Response response) {
	this.response=response;
	mapper=new ObjectMapper();
}
//TESTING PURPOSES
public RequestHandler() {
	mapper=new ObjectMapper();
	response=new Response(new CinemaController());
}
/**
 * Switch statment s to filter type of request
 * @param json
 * @return
 * @throws IOException 
 */
	public String  checkRequest(String msg) throws IOException {
		//TODO Convert json string to json node then create switch statments for GET POST PUT DELETE
		//BASED on each type invoke a method in response class
//		System.err.println(json);
		node=mapper.readValue(msg, ObjectNode.class);
		switch (node.get("type").asText()){
			case "GET":
				//Invoke response get method and return the JSON
				
			return response.getType(msg);//TODO return the response
			case "POST":
				//Invoke response post type method
				response.postType(msg);
				return "POST";
			case "PUT":
				response.putType(msg);
				return "PUT";
			case "DELETE":
				response.deleteType(msg);
				return "DELETE";
				
			
			
		
		}
		return null;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
