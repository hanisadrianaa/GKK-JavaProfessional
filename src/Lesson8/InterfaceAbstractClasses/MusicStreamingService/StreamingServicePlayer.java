package Lesson8.InterfaceAbstractClasses.MusicStreamingService;

public class StreamingServicePlayer implements MusicPlayer {
    private String currentSong;
    private String nextSong;

    public StreamingServicePlayer(String currentSong, String nextSong) {
        this.currentSong = currentSong;
        this.nextSong = nextSong;
    }

    @Override
    public void play() {
        System.out.println("Buffering and playing track: " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Pausing current track...");
    }

    @Override
    public void next() {
        playSong(nextSong);
        currentSong = nextSong;
        nextSong = fetchNextSong();
    }

    @Override
    public void previous() {
        String newSong = fetchPreviousSong();
        playSong(newSong);
        currentSong = newSong;
    }

    private void playSong(String songTitle) {
        System.out.println("Loading and playing next track: " + songTitle);
    }

    private String fetchNextSong() {
        return "SWAG & PRIDE - THE RAMPAGE from EXILE TRIBE";
    }

    private String fetchPreviousSong() {
        return "RIIZE - Love 119";
    }
}
