package iterator;

public class Album {
    static final int MAX_ITEMS = 20;
    private Song[] Songs;
    private int Count = 0;
    private String name;


    public Album(String name) {
        this.name = name;
        Songs = new Song[MAX_ITEMS];
    }

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

    public AlbumIterator createIterator() {
        return new AlbumIterator(Songs);
    }

    public String getName() {
        return this.name;
    }

}


