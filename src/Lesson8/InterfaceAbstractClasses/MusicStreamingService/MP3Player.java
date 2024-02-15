package Lesson8.InterfaceAbstractClasses.MusicStreamingService;

public class MP3Player implements MusicPlayer {
    private String currentSong;
    private String nextSong;

    public MP3Player(String currentSong, String nextSong) {
        this.currentSong = currentSong;
        this.nextSong = nextSong;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Pausing current track...");
    }

    @Override
    public void next() {
        playSong(nextSong);
        String temp = currentSong;
        currentSong = nextSong;
        nextSong = temp;
    }

    @Override
    public void previous() {
        String newSong = fetchPreviousSong();
        playSong(newSong);
        currentSong = newSong;
    }

    private void playSong(String songTitle) {
        System.out.println("Playing next track: " + songTitle);
    }

    private String fetchPreviousSong() {
        return "xikers - ROCKSTAR";
    }
}
