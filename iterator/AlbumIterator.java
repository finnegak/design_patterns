package iterator;

import java.util.Iterator;

public class AlbumIterator implements Iterator {
    
    private Song[] song;
    private int position = 0;

    public AlbumIterator(Song[] songs) {
        this.song = songs;
    }

    public boolean hasNext() {
        if(position >= song.length || song[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    public Song next() {
		position = position + 1;
		return song[position-1];
    }

}
