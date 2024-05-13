package PolymorphismAssignment;

public class PartTimeEmployee extends Employee {


    public PartTimeEmployee(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    public void calculatePay() {
       // super.calculatePay();

        System.out.println("Calculating pay for Part Time Employee");
    }
}
