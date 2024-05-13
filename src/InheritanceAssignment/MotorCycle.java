package InheritanceAssignment;

public class MotorCycle extends Vehicle {

    int numCylinders;

    public MotorCycle(String make,String model,int year,int numCylinders){
        super(make,model,year);
        this.numCylinders=numCylinders;
    }

    public void motorcycleInfo(){

        System.out.println("Make is: "+make);
        System.out.println("Model is: "+model);
        System.out.println("Year is: "+year);
        System.out.println("Number of Cylinders are: "+numCylinders);
    }
}
