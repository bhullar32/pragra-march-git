package April13;

import java.util.Scanner;

public class Array2Demo {

    public static void main(String[] args) {

        //Scanner to take user input

        int[] arr= new int[5]; // mentioning size

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");

        for (int i =0;i<arr.length;i++) {
            arr[0] = sc.nextInt();
        }

    }
}
