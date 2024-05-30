package May4;

public class EmpMain {

    public static void main(String[] args) {

        Employee<Integer,String> emp = new Employee<>(23,"John");;
        System.out.println(emp);
    }
}
