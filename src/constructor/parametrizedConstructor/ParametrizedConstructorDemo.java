package constructor.parametrizedConstructor;

public class ParametrizedConstructorDemo {
    String name;
    int age;

    ParametrizedConstructorDemo(String name, int age)
    {
        // mandatory to use because local variables and instance variables names
        // are same
//        name = name;    // Variable 'name' is assigned to itself
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args)
    {
        ParametrizedConstructorDemo obj = new ParametrizedConstructorDemo("Sachin", 23);
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}
