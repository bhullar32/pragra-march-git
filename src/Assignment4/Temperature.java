package Assignment4;

import java.util.Scanner;

public class Temperature {

    public Temperature() {
    }

    public void temp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        float c=sc.nextFloat();

        System.out.println("temperature in Cesius is: "+c);

    }

    public void temp(float c){



        float f= ((c*9)/5) + 32;
        System.out.println("temperature in Fahrenite is: " +f);

    }

    public void temp(double c){



        double k= c+273.15;
        System.out.println("temperature in kelvin is: "+k);

    }

    public static void main(String[] args) {

        Temperature t = new Temperature();
        t.temp();
        t.temp(12.0);
        t.temp(2.1366);
    }


}
