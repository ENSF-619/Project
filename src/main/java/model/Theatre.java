package model;
/**
 * ENSF 619 Group Project
 * Theatre class represents theatres within our system.
 * All theatres have a corresponding id, name and address.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

public class Theatre{

    private int theatreId;
    private String theatreName;
    private String address;

    public Theatre(int id, String name, String addy){
      this.theatreId=id;
      this.theatreName=name;
        this.address = addy;
        
    }

    /**
     * @return int return the theatreId
     */
    public int getTheatreId() {
        return theatreId;
    }

    /**
     * @param theatreId the theatreId to set
     */
    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    /**
     * @return String return the theatreName
     */
    public String getTheatreName() {
        return theatreName;
    }

    /**
     * @param theatreName the theatreName to set
     */
    public void setTheatreName(String addy) {
        this.address = addy;
    }

     /**
     * @return String return the theatreName
     */
    public String getTheatreAddress() {
        return address;
    }

    /**
     * @param theatreName the theatreName to set
     */
    public void setTheatreAddress(String addy) {
        this.address=addy;
    }

    @Override
    public String toString(){
        String s = getTheatreName()+", "+getTheatreAddress();

        return s;

    }

}