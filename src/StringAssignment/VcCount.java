package StringAssignment;

public class VcCount {

    //String s="";
    public static void main(String[] args) {

        int vcount =0;
        int ccount=0;
        String s="geeks";


        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);

        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){

            vcount++;
           System.out.println("Vowel count is " +vcount);
        }
        else{

            ccount++;
            System.out.println("Constant count is " +ccount);
        }

    }}
}
