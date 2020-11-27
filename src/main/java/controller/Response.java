package controller;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Response will check the model only-
 * @author zchem
 *
 */
public class Response {
	CinemaController cinema;
	ObjectMapper mapper =new ObjectMapper();
	JsonNode node;
	
	public Response(CinemaController cinema) {
		this.cinema=cinema;
		
	}
public String getType(String msg) throws IOException {
	//TODO filter by table example table:MOVIE 
	// Need to create as many cases as possible
	node=mapper.readTree(msg);
	switch (node.get("table").asText()) {
	case "MOVIE":
		return "THE HOBBIT";
		//TODO invoke cinema get movie list in json format [{movie1},{movie2}...etc}
	}
	return null;
		
	}
public String postType(String msg) {
	return msg;
		
	}
public String putType(String msg) {
	return msg;
	
}
public String deleteType(String msg) {
	return msg;
	
}

}
