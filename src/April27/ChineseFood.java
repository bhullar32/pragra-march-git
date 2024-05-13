package April27;

public class ChineseFood implements Food,IndiaChinese{


    @Override
    public void food() {

        System.out.println("This is chinese food");
    }

    @Override
    public void indCh() {
        System.out.println("This is Indian Chinese in Chinese food");
    }
}
