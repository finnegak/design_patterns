package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * JukeBox 
 * @author Kelly Finnegan
 */
public class JukeBox {

    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue <String> songQueue;

    /**
     * JukeBox Constructor that loads the songs into the songs Array List and initalizes the Queue of requested songs
     */
    private JukeBox(){
        songs = DataLoader.getSongs();
        songQueue = new LinkedList<String>();
    }
    
    /** 
     * method that creates a JukeBox and returns it
     * @return JukeBox object JukeBox
     */
    public static JukeBox getInstance(){
        if (jukeBox == null) {
			jukeBox = new JukeBox();
		}
        return jukeBox;
    }

    /** 
     * method that plays the next song in the queue
     * @return String tells user if song is playing or if no more songs are left in the queue
     */
    public String playNextSong() {
        String songName = songQueue.peek();
        if (hasMoreSongs()) {
            songQueue.remove();
            Song play = null;
            for(Song song: songs) {
                if(song.getTitle().equalsIgnoreCase(songName)) {
                    play = song;
                }
            }
            return "Let's jam to " + play;
        } else {
            return "You need to add songs to the list";
        }
    }

    /** 
     * method that checks if a song can be added
     * @param title name of song that is being asked to be added to queue
     * @return String tells the user if the song was added to queue or if the song is not in the song list
     */
    public String requestSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (title.equalsIgnoreCase(songs.get(i).getTitle())) {
                songQueue.add(title);
                return title + " is now number "+ songQueue.size() +" on the list";
            } 
        }
        return "Sorry we do not have the song " + title;
    }

    /** 
     * method checks if their is another song
     * @return boolean true if another song false if no more songs
     */
    public boolean hasMoreSongs() {
        if (songQueue.peek() != null) {
            return true;
        } else
            return false;
    }
}
