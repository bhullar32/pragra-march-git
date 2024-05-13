package AbstractAssignment;

public class VideoPlayer extends MediaDevice implements Playable{

    String videoTile="youtube video";
    int duration=3 ;

    @Override
    public void play(){

        System.out.println(videoTile+" is Playing for "+duration );

    }

    @Override
    void deviceDetails() {

        System.out.println("........This is a videoplayer.......");
        VideoPlayer vp = new VideoPlayer();
        vp.play();
    }
}
