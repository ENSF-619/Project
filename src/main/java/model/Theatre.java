package model;

public class Theatre{

    private int theatreId;
    private String theatreName;
    private String address;

    public Theatre(int id, String name){
        setTheatreId(id);
        setTheatreName(name);
        
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