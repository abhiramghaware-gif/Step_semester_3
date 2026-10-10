import java.util.Arrays;

class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int maxSize) {
        this.songs = new String[maxSize];
        this.songCount = 0;
    }

    public void addSong(String title) {
        if (songCount < songs.length) {
            songs[songCount] = title;
            songCount++;
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}

public class P2_ThePlaylist {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        
        System.out.println("Original first song: " + p.getSongs()[0]);
        System.out.println("Count: " + p.getSongCount());
    }
}
