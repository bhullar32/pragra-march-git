package May4;

public final class Student { // To make the class immutable, it has been declared final.
                            //  So that the class cannot be inherited and its details are not chnaged.
    // We need to call constructor in order to initialize the variables
    private final int id;
    private final String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

//The get methods are called to create immutable class.
// The reason set methods are not called is that, we do not
//want anyone set values rather than the admin itself.
