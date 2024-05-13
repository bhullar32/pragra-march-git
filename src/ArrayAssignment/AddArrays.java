package ArrayAssignment;

public class AddArrays {

    public static void main(String[] args) {

        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};

        int[][] array3 = new int [3][3];

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                array3[i][j]= array1[i][j]  + array2[i][j];;
                System.out.print(array3[i][j]+" ");
            }
           System.out.println();
        }
    }
}
