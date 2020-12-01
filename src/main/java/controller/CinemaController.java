package controller;

/**
 * ENSF 619 Group Project
 * This class is used as the controller for our backend model accesed
 * through cinemahub.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import model.CinemaHub;

public class CinemaController {
	private CinemaHub hub;

	public CinemaController(CinemaHub hub) {
		this.hub=hub;
		//BACK FILL THE MODEL
		
	}

	public CinemaHub getHub() {
		return hub;
	}

	public void setHub(CinemaHub hub) {
		this.hub = hub;
	}
	
	//ADD METHODS FOR GET PUT DELET POST 
	//NOTE NEED TO UPDATE BOTH MODEL AND SQL DATABASE AT SAME TIME

}
