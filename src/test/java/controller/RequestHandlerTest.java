package controller;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class RequestHandlerTest {


	@Test
	public void testRequest() throws IOException {
		RequestHandler r= new RequestHandler();
		String msg ="{\"type\":\"GET\",\"table\":\"MOVIE\"}";
		System.err.println(r.checkRequest(msg));
		
		fail("Not yet implemented");
	}

	
}
