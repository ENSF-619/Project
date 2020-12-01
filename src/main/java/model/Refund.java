package model;

/**
 * ENSF 619 Group Project
 * This class represents refund objects that are generated upon cancellation of ticket.
 * Refunds have corresponding issue dates and payment issue to allow for reimbursement
 * following ticket cancellation.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Refund {

    private String creditCard;
    private double ammount;
    private String issueDate;
    private String fname;
    private String lname;
    private String postal;
    private String address;
    private int cv;
    private String exp;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");



    public Refund(String creditCard, double ammount, String fname, String lname, String postal, String address, int cv, String exp, DateTimeFormatter dtf) {
        
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(dtf);
        this.issueDate = formattedDate;
        this.creditCard = creditCard;
        this.ammount = ammount;
        this.fname = fname;
        this.lname = lname;
        this.postal = postal;
        this.address = address;
        this.cv = cv;
        this.exp = exp;
        this.dtf = dtf;
    }

    public String getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public double getAmmount() {
        return this.ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPostal() {
        return this.postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCv() {
        return this.cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getExp() {
        return this.exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }


    @Override
    public String toString() {
        return "{" +
            " creditCard='" + getCreditCard() + "'" +
            ", ammount='" + getAmmount() + "'" +
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