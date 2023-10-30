package inheritance.constructorINheritance.example_01;

// Java program to show the sequence of constructor calling in single inheritence

class ParentClass
{
    ParentClass()
    {
        System.out.println("This is parent class constructor.");  // will be called first
    }
}
class ChildClass extends ParentClass
{
    ChildClass()
    {
        System.out.println("This is child class constructor.");  // will be called after parent class constructor
    }
}

public class ConstructorDemo
{
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
    }
}

