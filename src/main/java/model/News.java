package model;

/**
 * ENSF 619 Group Project
 * News class holds the news string that is output after
 * Registered users choose to view cinema news.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

public class News {

    private String[] body = {"Fans outraged as upcoming feature Dune stops production",
                        "Donald Trumps biopic My Golden Throne cancelled after Novemeber election results",
                        "Cuties 2 announcment sparks nationwode outrage in the United States",
                        "Saw 11 set for release in early 2023",
                        "All theatres predicted to close in 2024",
                        "Is theatre butter real? Popcorn experts say no",
                        "Netflix set to launce new virtual theatre platform in early 2023"};


    public String[] news() {
        return this.body;
        
    }
    
}


