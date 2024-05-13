package Assignment2;

import java.util.Scanner;

public class DayPractise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of a week: ");
        String day=sc.next().toLowerCase();

       switch(day){
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
            System.out.println(day+" is a weekday");
            break;

        case "saturday":
        case "sunday":
               System.out.println(day+" is a weekend");
               break;
        default:
        System.out.println("Invalid");
       }

    }
}
