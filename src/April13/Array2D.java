package April13;

import java.util.Scanner;

public class Array2D {

    //int[][] arr = new int[3][3];
    //int[][] arr1 = new int[2][2];
    int[][] arr2 = new int[5][5];

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[5][5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input for first array ");

        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){

                arr[0][0] = sc.nextInt();
            }
        }

        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr1.length;j++){

                System.out.println("Enter input for Second array");
                arr1[0][0] = sc.nextInt();

                arr2 [i][j]=arr[i][j] + arr1[i][j];
                System.out.println(arr2[i][j]);
            }
        }


    }

}


    //Enhanced for loop
    // for (element : arr)
    // System.out.println(element)