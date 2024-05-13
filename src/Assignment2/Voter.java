package Assignment2;

import java.util.Scanner;

public class Voter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user age: ");

        int age = sc.nextInt();;

        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
    }
}
