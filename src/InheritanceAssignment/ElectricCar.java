package InheritanceAssignment;

public class ElectricCar extends Car {

    String batteryCapacity;


    public ElectricCar(String make, String model, int year, int numDoors,String batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity=batteryCapacity;
    }

    public void chargeBattery(){

        System.out.println("Make is: "+make);
        System.out.println("Model is: "+model);
        System.out.println("Year is: "+year);

        System.out.println("Number of doors are: "+numDoors);
        System.out.println("battery capacity is: "+batteryCapacity);

    }
}
