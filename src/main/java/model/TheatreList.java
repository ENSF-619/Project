package model;
/**
 * ENSF 619 Group Project
 * TheatreList stores theatre objects in a list and has functionality to 
 * return all theatres and return specific theatres by name.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.util.ArrayList;

public class TheatreList {
	ArrayList<Theatre> theatres;

	public TheatreList(ArrayList<Theatre> tlist){
		this.theatres = tlist;
	}
	public ArrayList<Theatre> findTheatre(String name) {
		ArrayList<Theatre> temp = new ArrayList<Theatre>();
		for (Theatre theatre : theatres) {
			if (theatre.getTheatreName().toLowerCase().contains(name.toLowerCase())) {
				temp.add(theatre);
			}
		}
		return temp;
	}
	
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
	public ArrayList<Theatre> getAllTheatres(){
		return theatres;
	}

	public void removeTheatre(Theatre th){
		if(checkTheatre(th)){
			theatres.remove(th);
		}
	}
}
