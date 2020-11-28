package model;

import java.util.ArrayList;

public class TheatreList {
	ArrayList<Theatre> theatres;
	
	public Theatre getTheatre(int id) {
		for(Theatre theatre : theatres) {
			if(theatre.getTheatreId() == id) {
				return theatre;
			}
		}
		return null;
	}
}
