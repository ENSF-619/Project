package model;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.Random;
/**
 * ENSF 619 Group Project
 * 
 * The class `Ticket` represents tickets that are generated following user payment.
 * TicketId is used to track individual tickets. All tickets have a generated
 * issue date and the seat + showing connected to the ticket.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class Ticket{
	/**
	 * The instance variable `ticketID` - ID of the ticket
	 */
    private int ticketId;
    /**
     * The instance variable `price` - Price of the ticket
     */
    private double price;
    /**
     * The instance variable `mySeat` - Seat connected to the ticket
     */
    private Seat mySeat;
    /**
     * The instance variable `issueDate` - Generated issue date
     */
    private String issueDate;
    /**
     * The instance variable `showing` - `Showtime`connected to the ticket
     */
    private Showtime showing;
    /**
     * The instance variable `showtimeId` - ID of the showtime
     */
    private int showtimeId;
    /**
     * The instance variable `seatNum` - Seat number
     */
    private String seatNum;
    
    // Setting the DateTimeFormatter
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    /**
     * The constructor initializes the values of the instance variables.
     * @param s of type Seat
     * @param show of type Showtime
     */
    public Ticket(Seat s, Showtime show){
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(dtf);
        setIssueDate(formattedDate);
        setMySeat(s);
        setPrice(14.50);
        setTicketId(generateRandom(5));
        this.showing = show;
        this.showtimeId = show.getShowtimeId();
        this.seatNum = mySeat.getPosition();

    }
    
    /**
     * The constructor initializes the value of the instance variable.
     * @param id - ID of the ticket
     * @param p - Price of the ticket
     * @param issue - Generated issue date
     * @param showId - ID of the showtime
     * @param seat - Seat number
     */
    public Ticket(int id, double p, String issue, int showId, String seat){
        this.ticketId = id;
        this.price =p;
        this.showtimeId = showId;
        this.seatNum = seat;
        this.issueDate = issue;
    }
    
    /**
     * The method `generateRandom()` is used to generate random numbers of a given length.
     * @param length - Specified length
     * @return - random integer value.
     */
    private static int generateRandom(int length) {
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length); // bound is exclusive
        Random random = new Random();
        return (random.nextInt(max - min) + min);
    }

    /**
     * The getter method for instance variable `ticketId`
     * @return ID of the ticket
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * The setter method for instance variable `ticketId`
     * @param ticketId - ID of the ticket
     */
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    
    /**
     * The getter method for instance variable `seatNum`
     * @return Seat number
     */
    public String getSeatNum(){
        return this.seatNum;
     }
    
    /**
     * The setter method for instance variable `seatNum`
     * @param sNum - Seat number
     */
    public void setSeatNum(String sNum){
        this.seatNum = sNum;      
    }

    /**
     * The getter method for instance variable `price`
     * @return price - Price of the ticket
     */
    public double getPrice() {
        return price;
    }

    /**
     * The setter method for instance variable `price`
     * @param price - Price of the ticket
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * The getter method for instance variable `mySeat`
     * @return Seat connected to the ticket
     */
    public Seat getMySeat() {
        return mySeat;
    }

    /**
     * The setter method for instance variable `mySeat`
     * @param mySeat - Seat connected to the ticket
     */
    public void setMySeat(Seat mySeat) {
        this.mySeat = mySeat;
    }

    /**
     * The getter method for instance variable `issueDate`
     * @return Generated issue date
     */
    public String getIssueDate() {
        return issueDate;
    }
    
    /**
     * The setter method for instance variable `issueDate`
     * @param issueDate - the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    
    /**
     * The setter method for instance variable `showing`
     * @param s - `Showtime` to set
     */
    public void setShowtime(Showtime s){
        this.showing = s;
    }
    
    /**
     * The getter method for instance variable `showtimeId`
     * @return ID of the showtime
     */
    public int getShowtimeId(){
        return this.showtimeId;
    }

    /**
     * The `toString()` method is overridden to get a desired string representation of the ticket.
     * @return - Desired ticket string
     */
    public String toString(){
        String s =getTicketId() + ", " + getPrice() + ", " + getIssueDate() + "," + showtimeId + "," + seatNum;
        return s;
    }
}