package April13;

public class StringDemo {

    public static void main(String[] args) {

        //String literals
        String s1 ="test";
        String s2 = "test";
        String s3 = new String("test"); //String object


        System.out.println(s1==s2);//true  '==' operator checks for ref in string constant pool
        System.out.println(s1==s3);//false   the s3 has object created outside of string constant pool
        System.out.println(s1.equals(s3)); // '.equals()' menthod checks for the value







        /*String can be created by 2 ways

        1. String literal
        2. String Object----'new' keyword

        Strings are immutable---cannot be changed

        */







    }
}
