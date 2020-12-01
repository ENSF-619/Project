package model;
/**
 * ENSF 619 Group Project
 * The `News` class holds the news string that is output after
 * Registered users choose to view Cinema news.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class News {
	
	/**
	 * The instance variable `body` of type String array that contains news articles.
	 */
    private String[] body = {"Fans outraged as upcoming feature Dune stops production",
                        "Donald Trumps biopic My Golden Throne cancelled after Novemeber election results",
                        "Cuties 2 announcment sparks nationwode outrage in the United States",
                        "Saw 11 set for release in early 2023",
                        "All theatres predicted to close in 2024",
                        "Is theatre butter real? Popcorn experts say no",
                        "Netflix set to launce new virtual theatre platform in early 2023"};

    /**
     * The getter method for instance variable `body`
     * @return - News articles
     */
    public String[] news() {
        return this.body;
        
    }
    
}


