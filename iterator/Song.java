package iterator;

public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    public String toString() {
        return this.name + " by " + this.artist + " category: " + genre + " length: " + length + " min";
    }
}
