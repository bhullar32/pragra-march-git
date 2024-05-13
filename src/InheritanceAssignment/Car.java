package InheritanceAssignment;

public class Car extends Vehicle{

    int numDoors;


    public Car(String make, String model, int year,int numDoors) {
        super(make, model, year);
        this.numDoors=numDoors;
    }

    public void display(){

        System.out.println("Make is: "+make);
        System.out.println("Model is: "+model);
        System.out.println("Year is: "+year);
        System.out.println("Number of doors are:"+numDoors);
    }

}
