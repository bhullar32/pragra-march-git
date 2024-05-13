package Assignment2;

import java.util.Scanner;


public class CircleArea {

      double  p=3.14;
    // int r;
    public static void main(String[] args) {
        final double  p=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter raduis to calculate area: ");
       double r=sc.nextInt();

       double area = p*(r*r);

       System.out.println("Area of circle is: " +area);

    }
}
