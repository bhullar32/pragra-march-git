package InheritanceAssignment;

public class VehicleMain {

    public static void main(String[] args) {

        Car c = new Car("Honda","Civic",2022,4);
        c.display();

        MotorCycle mc = new MotorCycle("Royal Enfield","350",2023,4);
        mc.motorcycleInfo();

        ElectricCar ec = new ElectricCar("Tesla","Model 3",2023,2,"7 hours");
        ec.chargeBattery();
    }
}
