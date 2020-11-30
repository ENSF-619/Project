package main;

import model.*;
import controller.*;

import controller.CinemaController;
import view.controllers.GuiController;

public class App {

	public static void main(String[] args) {
		
		// DB CONNECTION
		DBController dbc = new DBController();
		
		// CREATING MODEL
		MovieList movies = new MovieList(dbc.getMovies());
		TheatreList theatres = new TheatreList(dbc.getTheatres());
		RegList regUsers = new RegList(dbc.getRegisteredUsers());
		VoucherList vouchers = new VoucherList(dbc.getVouchers());
		ShowtimeList showtimes = new ShowtimeList(dbc.getShowtimes());
	
		TicketList tickets = new TicketList(dbc.getTickets(),showtimes.getAllShowtimes());
		
		CinemaHub cinema = new CinemaHub(movies, theatres, showtimes, tickets, regUsers, vouchers);
		CinemaController ctr=new CinemaController(cinema);
		
//		System.err.println(ctr.getHub().getShowtimes().getShowtimeById(10005).getSeats().toString());
		GuiController gui =new GuiController(ctr);
//		System.err.println(ctr.getHub().getMovies().getAllMovies().toString());
//		System.err.println(ctr.getHub().getShowtimes().getShowtimeById(10001).getSeats().toString());
		// CREATING GUI
		// CREATING CONTROLLERS
//		CinemaController cinema = new CinemaController();
//		Response response =new Response(cinema);
//		RequestHandler request =new RequestHandler(response);
//		ModelController model =new ModelController(request);
//		GuiController gui =new GuiController(model);
	}

}
