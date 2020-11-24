import java.sql.Date;
import java.util.Random;

public class Ticket{

    private int ticketId;
    private double price;
    private Seat mySeat;
    private Date issueDate;

    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

    public Ticket(Seat s){
        setIssueDate(formatter.format(new Date(System.currentTimeMillis())));
        setMySeat(s);
        setPrice(14.50);
        setTicketId(generateRandom(5));
        
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

    /**
     * @return Date return the issueDate
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

}