package model;
/**
 * ENSF 619 Group Project
 * The class `Movie` holds movie information like name, rating and id.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class Movie{
	
	/**
	 * The instance variable `movieId` - integer ID of the movie
	 */
    private int movieId;
    /**
     * The instance variable `movieName` - Name of the movie
     */
    private String movieName;
    /**
     * The instance variable `rating` - String rating of the movie
     */
    private String rating;
    
    /**
     * The constructor initializes the values of the instance variables.
     * @param id - Movie ID
     * @param name - Movie name
     * @param r - Movie rating
     */
    public Movie(int id, String name, String r){
        setMovieId(id);
        setMovieName(name);
        setRating(r);
    }
    
    /**
     * The getter method for instance variable `movieID`
     * @return - ID of the movie
     */
    public int getMovieId() {
        return movieId;
    }
    
    /**
     * The setter method for instance variable `movieID`
     * @param movieId - ID of the movie
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    /**
     * The getter method for instance variable `movieName`
     * @return - Name of the movie
     */
    public String getMovieName() {
        return movieName;
    }
    
    /**
     * The setter method for instance variable `movieName`
     * @param movieName - Name of the movie
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    /**
     * The getter method for instance variable `rating`
     * @return - Rating of the movie
     */
    public String getRating(){
        return this.rating;
    } 
    
    /**
     * The setter method for instance variable `rating`
     * @param r - Rating of the movie
     */
    public void setRating(String r){
        this.rating = r;
    }
    
    /**
     * The `toString()` method is overridden to get a desired string representation of the movie
     * @return - Desired movie string
     */
	public String toString() {
		StringBuffer sb =new StringBuffer();
		sb.append("ID: " + movieId + "\n");
		sb.append("Name: " + movieName + "\n");
		sb.append("Rating: " + rating + "\n");
		return sb.toString();
	}

}