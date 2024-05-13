package Assignment_1;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input for traffic light: ");

        s=sc.nextLine();

        if(s.equals("red")){
            System.out.println("STOP");
        } else if (s.equals("yellow")) {
            System.out.println("PREPARE TO STOP");
        }
        else if(s.equals("green")){
            System.out.println("GO");
        }


    }
}
