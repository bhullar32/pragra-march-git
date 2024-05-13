package April13;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70};
        int [] arr1 = new int [7];
        int temp;

        for (int i=0;i<=arr.length;i++){
            for (int j=7;j<arr1.length-1;j--) {


                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

            System.out.println(arr[i]);
        }



    }
}
