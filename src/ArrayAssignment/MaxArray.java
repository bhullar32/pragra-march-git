package ArrayAssignment;

public class MaxArray {

    public static void main(String[] args) {

        int arr[]={10,30,43,54,23,543,43,32};
        int max=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }System.out.println("Max Element is " +max);

    }
}
