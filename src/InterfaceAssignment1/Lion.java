package InterfaceAssignment1;

public class Lion implements Animal{


    @Override
    public void feed() {
        System.out.println("Lion feeds on Meat");
    }

    @Override
    public void makeSound() {

        System.out.println("Lion roars");
    }
}
