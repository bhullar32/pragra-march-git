package April13;

public class ArrayPractise {

    public static void main(String[] args) {

        int [] arr = {23,44,23,52,54,23,87,87};
        int sum=0;

        for (int i=0;i<arr.length;i++){

            sum+=arr[i];
        }
        System.out.println("sum is " +sum);
    }
}
