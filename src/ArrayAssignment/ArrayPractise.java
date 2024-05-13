package ArrayAssignment;

public class ArrayPractise {


    //int n;
    public static void main(String[] args) {

        int arr[]={10,30,43,54,23,543,43,32};
    int i;
    int n= arr.length;;

    for(i=0;i<n/2;i++){

        int t=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=t;
    }

    for(int j=0;j<n;j++){
        System.out.println(arr[j]);
        }

}


}
