package PolymorphismAssignment;

public class EmpMain {

    public static void main(String[] args) {

        FullTimeEmployee fe = new FullTimeEmployee(45,"John");
        fe.calculatePay();

        PartTimeEmployee pe = new PartTimeEmployee(25,"Smith");
        pe.calculatePay();
    }
}
