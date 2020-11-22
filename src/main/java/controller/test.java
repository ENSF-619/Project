package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import view.ViewController;

public class test  {
Observer observer;
public void addObs(Observer obs) {
	observer=obs;
}
	public static void main(String[] args) throws JsonProcessingException {
		ModelController mc =new ModelController();
		ViewController vc=new ViewController(mc);
//		t.addObs(mc);
//		ObjectMapper mapper =new ObjectMapper();
//		ObjectNode jNode = mapper.createObjectNode();
//		jNode.put("Type", "GET");
//		jNode.put("MovieID", 10001);
//		System.out.println(jNode);
//		
//		System.out.println(t.observer.update(mapper.writeValueAsString(jNode)));
	}

}
