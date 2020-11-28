package model;


public class User {

    private String creditCard;
    private String fname;
    private String lname;
    private String postal;
	private String address;
	private String email;


    public User(String creditCard, String fname, String lname, String postal, String address, String email) {
        
       
        this.creditCard = creditCard;
        this.fname = fname;
        this.lname = lname;
        this.postal = postal;
		this.address = address;
		this.email = email;
     
    }

    public String getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(String email) {
        this.email = email;
	}
	
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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



    @Override
    public String toString() {
        return "{" +
            " creditCard='" + getCreditCard() + "'" +
            ", fname='" + getFname() + "'" +
            ", lname='" + getLname() + "'" +
            ", postal='" + getPostal() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

   

}