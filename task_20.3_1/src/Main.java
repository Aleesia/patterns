public class Main {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.addTrack("strategy");
        mediaPlayer.addTrack("state");
        mediaPlayer.addTrack("bridge");
        mediaPlayer.addTrack("adapter");
        mediaPlayer.addTrack("singleton");
        mediaPlayer.addTrack("visitor");

        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.next();
        mediaPlayer.next();
        mediaPlayer.prev();
        mediaPlayer.stop();
        mediaPlayer.play();
        mediaPlayer.stop();


    }

}