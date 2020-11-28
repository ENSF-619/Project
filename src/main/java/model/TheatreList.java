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

	public boolean checkTheatre(Theatre theatre){
		for(Theatre t:theatres){
			if(t.getTheatreId() == theatre.getTheatreId()){
				return true;
			}
		}
		return false;
	}

	public void addTheatre(Theatre th){
		if(!checkTheatre(th)){
			theatres.add(th);
		}
	}

	public void removeTheatre(Theatre th){
		if(checkTheatre(th)){
			theatres.remove(th);
		}
	}
}
