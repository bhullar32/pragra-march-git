package AbstractAssignment;

public class ImageDisplay extends MediaDevice implements Playable{

    String imageName="nature view";
    String resolution="760 * 1240";

    @Override
    public void play() {

        System.out.println(imageName+" is displayig in resolution "+resolution);
    }

    @Override
    void deviceDetails() {

        System.out.println(".........This is image displayer............. ");
        ImageDisplay id = new ImageDisplay();
        id.play();
    }
}
