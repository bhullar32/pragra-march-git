package PolymorphismAssignment;

public class Employee {

    int EmployeeId;
    String EmployeeName;

    public Employee(int employeeId, String employeeName) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
    }

    public void calculatePay(){

        System.out.println("Calculating Pay......");
    }
}
