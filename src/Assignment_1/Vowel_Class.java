package Assignment_1;

public class Vowel_Class {
        //char ch;
    public void vowel(char ch){
        //char ch = '';
        
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch== 'O' || ch=='U')
        {
         System.out.println("Character is a vowel");  
        }
        else{
            System.out.println("Character is a Constant");
        }
            

    }

    public static void main(String[] args){

        Vowel_Class v = new Vowel_Class();
       v.vowel('d');

    }

}
