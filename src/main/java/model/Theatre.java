package model;
/**
 * ENSF 619 Group Project
 * Theatre class represents theatres within our system.
 * All theatres have a corresponding id, name and address.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class Theatre{
	/**
	 * The instance variable `theatreId` - ID of the theatre
	 */
    private int theatreId;
    /**
     * The instance variable `theatreName` - Name of the theatre
     */
    private String theatreName;
    /**
     * The instance variable `address` - Address of the theatre
     */
    private String address;
    
    /**
     * The constructor initializes the values of the instance variables.
     * @param id - ID of the theatre
     * @param name - Name of the theatre
     * @param addy - Address of the theatre
     */
    public Theatre(int id, String name, String addy){
      this.theatreId=id;
      this.theatreName=name;
      this.address = addy;
        
    }

    /**
     * The getter method for instance variable `theatreId`
     * @return ID of the theatre
     */
    public int getTheatreId() {
        return theatreId;
    }

    /**
     * The setter method for instance variable `theatreId`
     * @param theatreId - ID of the theatre
     */
    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    /**
     * The getter method for instance variable `theatreName`
     * @return Name of the theatre
     */
    public String getTheatreName() {
        return theatreName;
    }

    /**
     * The setter method for instance variable `theatreName`
     * @param theatreName - Name of the theatre
     */
    public void setTheatreName(String addy) {
        this.address = addy;
    }

    /**
     * The getter method for instance variable `address`
     * @return Address of the theatre
     */
    public String getTheatreAddress() {
        return address;
    }

    /**
     * The setter method for instance variable `address`
     * @param addy - Address of the theatre
     */
    public void setTheatreAddress(String addy) {
        this.address=addy;
    }

    /**
     * The `toString()` method is overridden to get a desired string representation of the theatre
     * @return - Desired theatre string
     */
    public String toString(){
        String s = getTheatreName() + ", " + getTheatreAddress();
        return s;
    }
}