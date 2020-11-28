package model;

public class Theatre{

    private int theatreId;
    private String theatreName;
    private String adress;

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
    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

}