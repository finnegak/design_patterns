package iterator;

/**
 * A Song object
 * @author Kelly Finnegan
 * 
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * Song constructor that sets the attributes
     * @param name name of the Song
     * @param artist name of the artist
     * @param length length of the song
     * @param genre genre of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * method that returns a string with the attributes of song
     * @return string about the song
     */
    public String toString() {
        return this.name + " by " + this.artist + " category: " + genre + " length: " + length + " min";
    }
}
