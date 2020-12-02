package model;
import java.util.ArrayList;
/**
 * ENSF 619 Group Project
 * The class `TheatreList` stores theatre objects in a list and has functionality to 
 * return all theatres and return specific theatres by name.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class TheatreList {
	/**
	 * The instance variable `theatres` of type ArrayList Theatre
	 */
	private ArrayList<Theatre> theatres;
	
	/**
	 * The constructor initializes the value of the instance variable.
	 * @param tlist - of type ArrayList Theatre
	 */
	public TheatreList(ArrayList<Theatre> tlist){
		this.theatres = tlist;
	}
	
	/**
	 * The getter method for instance variable `theatres`
	 * @return - `theatres` of type ArrayList Theatre
	 */
	public ArrayList<Theatre> getAllTheatres(){
		return theatres;
	}
	
	/**
	 * The method `findTheatre()` returns theatres based on specified name.
	 * @param name - Name of the theatre
	 * @return - theatres based on specified name.
	 */
	public ArrayList<Theatre> findTheatre(String name) {
		ArrayList<Theatre> temp = new ArrayList<Theatre>();
		for (Theatre theatre : theatres) {
			if (theatre.getTheatreName().toLowerCase().contains(name.toLowerCase())) {
				temp.add(theatre);
			}
		}
		return temp;
	}
	
	/**
	 * The method `getTheatre()` returns theatre based on given ID.
	 * @param id - ID of the theatre.
	 * @return - theatre based on given ID.
	 */
	public Theatre getTheatre(int id) {
		for(Theatre theatre : theatres) {
			if(theatre.getTheatreId() == id) {
				return theatre;
			}
		}
		return null;
	}
	
	/**
	 * The method `checkTheatre()` compares theatres by their id's
	 * @param theatre - of type Theatre
	 * @return - True if ID's are same, else it returns false.
	 */
	public boolean checkTheatre(Theatre theatre){
		for(Theatre t:theatres){
			if(t.getTheatreId() == theatre.getTheatreId()){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * The method `addTheatre()` is used to add a Theatre.
	 * @param th - of type Theatre
	 */
	public void addTheatre(Theatre th){
		if(!checkTheatre(th)){
			theatres.add(th);
		}
	}
	
	/**
	 * The method `removeTheatre()` is used to remove a Theatre.
	 * @param th - of type Theatre
	 */
	public void removeTheatre(Theatre th){
		if(checkTheatre(th)){
			theatres.remove(th);
		}
	}
}
