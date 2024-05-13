package AbstractAssignment;

public class MediaMain {

    public static void main(String[] args) {

        AudioPlayer ap = new AudioPlayer();
        ap.deviceDetails();

        VideoPlayer vp = new VideoPlayer();
        vp.deviceDetails();

        ImageDisplay id = new ImageDisplay();
        id.deviceDetails();
    }
}
