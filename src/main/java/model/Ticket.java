package model;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.Random;

public class Ticket{
	
    private int ticketId;
    private double price;
    private Seat mySeat;
    private String issueDate;
    private Showtime showing;
    private int showtimeId;
    private String seatNum;
    

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    

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

    public Ticket(int id, double p, String issue, int showId, String seat){
        this.ticketId = id;
        this.price =p;
        this.showtimeId = showId;
        this.seatNum = seat;
        this.issueDate = issue;
    }

    private static int generateRandom(int length) {
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length); // bound is exclusive

        Random random = new Random();

        return (random.nextInt(max - min) + min);
    }

    /**
     * @return int return the ticketId
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * @param ticketId the ticketId to set
     */
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setSeatNum(String sNum){
        this.seatNum = sNum;
        
    }


    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return Seat return the mySeat
     */
    public Seat getMySeat() {
        return mySeat;
    }

    /**
     * @param mySeat the mySeat to set
     */
    public void setMySeat(Seat mySeat) {
        this.mySeat = mySeat;
    }

    public String getSeatNum(){
       return this.seatNum;
    }

    /**
     * @return Date return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }
    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setShowtime(Showtime s){
        this.showing = s;
    }

    public int getShowtimeId(){
        return this.showtimeId;
    }

    @Override
    public String toString(){
        String s =getTicketId()+", "+getPrice()+", "+getIssueDate()+","+showtimeId+","+seatNum;
        return s;
    }


}