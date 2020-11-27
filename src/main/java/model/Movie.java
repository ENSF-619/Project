public class Movie{

    private int movieId;
    private String movieName;

    public Movie(int id, String name){
        setMovieId(id);
        setMovieName(name);
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

}