package main;

import controller.CinemaController;
import controller.ModelController;
import controller.RequestHandler;
import controller.Response;
import view.GuiController;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CinemaController cinema=new CinemaController();
		Response response =new Response(cinema);
		RequestHandler request =new RequestHandler(response);
		ModelController model =new ModelController(request);
		GuiController gui =new GuiController(model);
	}

}
