package AbstractAssignment;

public class AudioPlayer extends MediaDevice implements Playable {

    String songName="klk";
    String artist="john";


    @Override
    public void play(){

        System.out.println(songName+" palying for "+artist);
    }

    @Override
    void deviceDetails() {


        System.out.println(".................This is a Audioplayer...........");
        AudioPlayer ap = new AudioPlayer();
        ap.play();
    }
}
