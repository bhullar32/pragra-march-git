package April27;

public class IndiaFood implements Food,IndiaChinese{


    @Override
    public void food() {

        System.out.println("This is India Food");

    }

    @Override
    public void indCh() {
        System.out.println("This is Indian Chinese Food");
    }
}
