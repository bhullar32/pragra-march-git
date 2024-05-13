package April13;

import java.util.Arrays;

public class MaxMin {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};

        System.out.println("max array is" +Arrays.stream(arr).max());
        System.out.println("Min array is" + Arrays.stream(arr).min());
    }
}
