package Assignment_1;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {

        int score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Score: ");
        score=sc.nextInt();;

        if(score>90 && score<100){
            System.out.println("Great");
        }
        else if(score>80 && score<89){
            System.out.println("Good");
        }
        else if (score>70 && score<79){
            System.out.println(" fair");
        }
        else if (score >60 && score<69){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
