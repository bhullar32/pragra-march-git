package Assignment2;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to calculate square area: ");

        double a = sc.nextInt();
        double area= a*a;

        System.out.println("Area of square is: " +area);

    }
}
