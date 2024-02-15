package Lesson8.InterfaceAbstractClasses.MusicStreamingService;

public class TestMusicPlayer {
    public static void main(String[] args) {
        // MP3 player
        System.out.println("Using MP3 Player:");
        MusicPlayer mp3Player = new MP3Player("Why Don't We - Fallin' (Adrenaline)", "Tan Jianci - IMMA GET IT");
        mp3Player.play();
        mp3Player.next();
        mp3Player.pause();
        mp3Player.previous();

        // streaming service player
        System.out.println("\nUsing Streaming Service Player:");
        MusicPlayer streamingPlayer = new StreamingServicePlayer("TWS - plot twist", "5 Seconds of Summer - Youngblood");
        streamingPlayer.play();
        streamingPlayer.next();
        streamingPlayer.pause();
        streamingPlayer.previous();
    }
}
