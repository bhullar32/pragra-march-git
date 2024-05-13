package InheritanceAssignment;

public class Vehicle {

    String make;
    String model;
    int year;

   public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){

        System.out.println("Vehicle is starting");
    }

    public void stop(){
        System.out.println("Vehicle is stopping ");
    }

    public void displayInfo(){

        System.out.println("Make is: "+make);
        System.out.println("Model is: "+model);
        System.out.println("Year is: "+year);
    }
}
