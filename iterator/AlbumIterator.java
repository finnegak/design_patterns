package iterator;

import java.util.Iterator;

/**
 * An AlbumIterator that implements an imported Iterator
 * @author Kelly Finnegan
 * 
 */
public class AlbumIterator implements Iterator {
    
    private Song[] song;
    private int position = 0;

    /**
     * method that sets the songs in the song array
     * @param songs array of songs
     */
    public AlbumIterator(Song[] songs) {
        this.song = songs;
    }

    /**
     * method that checks if another song is next
     * @return true if more songs are in the song array
     */
    public boolean hasNext() {
        if(position >= song.length || song[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    /**
     * method that returns the songs
     * @return Song object
     */
    public Song next() {
		position = position + 1;
		return song[position-1];
    }

}
