package iterator;

/**
 * An Album object
 * @author Kelly Finnegan
 * 
 */
public class Album {
    static final int MAX_ITEMS = 20;
    private Song[] Songs;
    private int Count = 0;
    private String name;

    /**
     * Album constructor that sets the name and Songs in an Album
     * @param name name of the album
     */
    public Album(String name) {
        this.name = name;
        Songs = new Song[MAX_ITEMS];
    }

    /**
     * boolean that adds all the attributes of a song to the Songs array
     * @param name name of the song
     * @param artist name of the artist of the song
     * @param length length of the song
     * @param genre genre of the song
     * @return boolean if the song was successful added
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        Song song = new Song(name, artist, length, genre);
        boolean added = true;
        if (Count >= MAX_ITEMS) {
			added = false;
		} else {
			Songs[Count] = song;
			Count = Count + 1;
		}
        return added;
    }

    /**
     * creates Iterator for the Songs array
     * @return AlbumIterator
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(Songs);
    }

    /**
     * returns the name of the song
     * @return name
     */
    public String getName() {
        return this.name;
    }

}


