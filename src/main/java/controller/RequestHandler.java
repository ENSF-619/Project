package controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import view.BrowseMovie;
import view.MovieData;

public class RequestHandler {
	String request;
	boolean status;
	public RequestHandler() 
	{
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
