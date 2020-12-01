package main;

import model.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import controller.*;

import controller.CinemaController;
import view.controllers.GuiController;

public class App {

	public static void main(String[] args) throws ParseException {
		
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
		//CREATING GUI
//		SimpleDateFormat fort=new SimpleDateFormat("yyyy-MM-DD HH:mm:ss"); 
		GuiController gui =new GuiController(ctr);
//		Ticket t=ctr.getHub().getTickets().getTicket(10001);
//		Date d=fort.parse(t.getIssueDate());
//		Date d2=fort.parse(new java.sql.Timestamp(System.currentTimeMillis())+"");
//		double h1=(d.getTime()-d2.getTime())/1000/3600;
//		System.err.println(d+"   \n"+d2+"\n"+h1);
//	}

}}
