package singleton;

/**
 * song object
 * @author Kelly Finnegan
 */
public class Song {

    private String title;
    private String artist;

    /**
     * Song constructor that sets the instance variables
     * @param title name of the song
     * @param artist name of the artist/band
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * method toString about the song
     * @return string with song title and artist
     */
    public String toString(){
        return title + " by " + artist;
    }

    /**
     * accessor for title
     * @return title
     */
    public String getTitle(){
        return this.title;
    }
}
