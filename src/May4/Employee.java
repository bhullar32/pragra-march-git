package May4;

class Employee<T, R>{

    T id;
    R name;

    public Employee(T id, R name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}





