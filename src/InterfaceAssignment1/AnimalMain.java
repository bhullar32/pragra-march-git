package InterfaceAssignment1;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a = new Lion();
        a.feed();
        a.makeSound();

        Swimmable s = new Penguin();
        s.swim();

        Climbable c = new Monkey();
        c.climb();
    }
}
