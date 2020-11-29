package model;

public class Seat{
    private boolean status;
    private String position;
   private double price;

    
    public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	public Seat(boolean s, String spot,double price){
        setPosition(spot);
        setStatus(s);
        this.price=price;
    }

    public Seat(String spot){
        setStatus(false);
        setPosition(spot);
    }
    /**
     * @return boolean return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return String return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString(){
        return getPosition();
    }

}