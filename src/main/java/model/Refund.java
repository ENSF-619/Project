package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * ENSF 619 Group Project
 * The class `Refund` represents refund objects that are generated upon cancellation of ticket.
 * Refunds have corresponding issue dates and payment issue to allow for reimbursement
 * following ticket cancellation.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class Refund {
	/**
	 * The instance variable `creditCard` of type String
	 */
    private String creditCard;
    /**
     * The instance variable `amount`
     */
    private double amount;
    /**
     * The instance variable `issueDate`
     */
    private String issueDate;
    /**
     * The instance variable `fname` - First name
     */
    private String fname;
    /**
     * The instance variable `lname` - Last name
     */
    private String lname;
    /**
     * The instance variable `postal` - Postal code
     */
    private String postal;
    /**
     * The instance variable `address` - Address
     */
    private String address;
    /**
     * The instance variable `cv` - CVV of the credit card
     */
    private int cv;
    /**
     * The instance variable `exp` - Expiry of the credit card
     */
    private String exp;
    
    // Setting the DateTimeFormatter
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    /**
     * The constructor initializes the values of the instance variables.
     * @param creditCard - of type String
     * @param amount - of type double
     * @param fname - First name
     * @param lname - Last name
     * @param postal - Postal code
     * @param address - Address
     * @param cv - CVV of the credit card
     * @param exp - Expiry of the credit card
     * @param dtf - DateTimeFormatter
     */
    public Refund(String creditCard, double amount, String fname, String lname, 
    		String postal, String address, int cv, String exp, DateTimeFormatter dtf) 
    {      
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(dtf);
        this.issueDate = formattedDate;
        this.creditCard = creditCard;
        this.amount = amount;
        this.fname = fname;
        this.lname = lname;
        this.postal = postal;
        this.address = address;
        this.cv = cv;
        this.exp = exp;
        this.dtf = dtf;
    }
    
    /**
     * The getter method for instance variable `creditCard`
     * @return - creditCard of type `String`
     */
    public String getCreditCard() {
        return this.creditCard;
    }
    
    /**
     * The setter method for instance variable `creditCard`
     * @param creditCard - of type `String`
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    
    /**
     * The getter method for instance variable `amount`
     * @return - amount of type `double`
     */
    public double getAmount() {
        return this.amount;
    }
    
    /**
     * The setter method for instance variable `amount`
     * @param amount of type `double`
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    /**
     * The getter method for instance variable `issueDate`
     * @return - Date of issue
     */
    public String getIssueDate() {
        return this.issueDate;
    }
    
    /**
     * The setter method for instance variable `issueDate`
     * @param issueDate - Date of issue
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    
    /**
     * The getter method for instance variable `fName`
     * @return - First name
     */
    public String getFname() {
        return this.fname;
    }
    
    /**
     * The setter method for instance variable `fName`
     * @param fname - First name
     */
    public void setFname(String fname) {
        this.fname = fname;
    }
    
    /**
     * The getter method for instance variable `lName`
     * @return - Last name
     */
    public String getLname() {
        return this.lname;
    }
    
    /**
     * The setter method for instance variable `lName`
     * @param lname - Last name
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    /**
     * The getter method for instance variable `postal`
     * @return - Postal code
     */
    public String getPostal() {
        return this.postal;
    }
    
    /**
     * The setter method for instance variable `postal`
     * @param postal - Postal code
     */
    public void setPostal(String postal) {
        this.postal = postal;
    }
    
    /**
     * The getter method for instance variable `address`
     * @return - Address
     */
    public String getAddress() {
        return this.address;
    }
    
    /**
     * The setter method for instance variable `address`
     * @param address - Address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * The getter method for instance variable `cv`
     * @return - CVV of the credit card
     */
    public int getCv() {
        return this.cv;
    }
    
    /**
     * The setter method for instance variable `cv`
     * @param cv - CVV of the credit card
     */
    public void setCv(int cv) {
        this.cv = cv;
    }
    
    /**
     * The getter method for instance variable `exp`
     * @return - Expiry of the credit card
     */
    public String getExp() {
        return this.exp;
    }
    
    /**
     * The setter method for instance variable `exp`
     * @param exp - Expiry of the credit card
     */
    public void setExp(String exp) {
        this.exp = exp;
    }

    /**
     * The `toString()` method is overridden to get a desired string representation of the refund
     * @return - Desired refund string
     */
    public String toString() {
        return "{" +
            " creditCard='" + getCreditCard() + "'" +
            ", amount='" + getAmount() + "'" +
            ", issueDate='" + getIssueDate() + "'" +
            ", fname='" + getFname() + "'" +
            ", lname='" + getLname() + "'" +
            ", postal='" + getPostal() + "'" +
            ", address='" + getAddress() + "'" +
            ", cv='" + getCv() + "'" +
            ", exp='" + getExp() + "'" +
            "}";
    }
}