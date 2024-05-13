package Assignment4;

public class Shape {

    public void area(double radius){
        double pi=3.14;
        double area = pi*(radius*radius);
        System.out.println("Area of circle is: "+area);

    }

    public void area(int a){

        double area = a*a;
        System.out.println("Area os square is: "+area);
    }

    public void area(int l,int b){

        double area = l*b;
        System.out.println("Area of rectangle is: "+area);
    }

    public static void main(String[] args) {

        Shape s = new Shape();
        s.area(1.2);
        s.area(5);
        s.area(4,2);
    }

}
