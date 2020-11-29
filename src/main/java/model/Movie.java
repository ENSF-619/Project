package model;

public class Movie{

    private int movieId;
    private String movieName;
    private String rating;

    public Movie(int id, String name, String r){
        setMovieId(id);
        setMovieName(name);
        setRating(r);
    }

    public void setRating(String r){
        this.rating = r;
    }

    public String getRating(){
        return this.rating;
    }

    /**
     * @return int return the movieId
     */
    public int getMovieId() {
        return movieId;
    }

    /**
     * @param movieId the movieId to set
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    /**
     * @return String return the movieName
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName the movieName to set
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

	@Override
	public String toString() {
		StringBuffer sb =new StringBuffer();
		sb.append("ID: "+movieId+"\n");
		sb.append("Name: "+movieName+"\n");
		sb.append("Rating: "+rating+"\n");
		return sb.toString();
	}

}