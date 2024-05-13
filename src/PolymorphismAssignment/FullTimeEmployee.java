package PolymorphismAssignment;

public class FullTimeEmployee extends Employee {


    public FullTimeEmployee(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    public void calculatePay() {
       // super.calculatePay();
        System.out.println("Calculating pay for Full Time Employee");
    }
}
