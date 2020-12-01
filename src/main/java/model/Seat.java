package model;
/**
 * ENSF 619 Group Project
 * The class `Seat` represents seat objects which are kept by showtimes. 
 * Seats have a position as well as a status to control
 * which seats are available/unavailable based on ticket sales.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class Seat{
	/**
	 * The instance variable `status` that indicates availability of seat.
	 */
    private boolean status;
    /**
     * The instance variable `position` that represents position of seat.
     */
    private String position;
    /**
     * The instance variable `price` of type `double`
     */
    private double price;
    
    /**
     * The constructor initializes the values of the instance variables.
     * @param s - Status of the seat
     * @param spot - Position of the seat
     * @param price - Price of the seat
     */
    public Seat(boolean s, String spot, double price){
        setPosition(spot);
        setStatus(s);
        this.price=price;
    }
    
    /**
     * The constructor method
     * @param spot - Position of the seat
     */
    public Seat(String spot){
        setStatus(false);
        setPosition(spot);
    }
    
    /**
     * The getter method for instance variable `status`
     * @return - Status of the seat
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * The setter method for instance variable `status`
     * @param status - Status of the seat
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * The getter method for instance variable `position`
     * @return - Position of the seat
     */
    public String getPosition() {
        return position;
    }

    /**
     * The setter method for instance variable `position`
     * @param position - Position of the seat
     */
    public void setPosition(String position) {
        this.position = position;
    }
    
    /**
     * The getter method for instance variable `price`
     * @return - Price of the seat
     */
    public double getPrice() {
    	return price;
    }
    
    /**
     * The setter method for instance variable `price`
     * @param price - Price of the seat
     */
    public void setPrice(double price) {
    	this.price = price;
    }

    /**
     * The `toString()` method is overridden to get a desired string representation of the seat
     * @return - Desired seat string
     */
    public String toString(){
        return getPosition() + " " + status;
    }

}