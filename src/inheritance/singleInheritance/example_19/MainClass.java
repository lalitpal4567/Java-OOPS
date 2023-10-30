package inheritance.singleInheritance.example_19;


class A
{
    int age = 10;
}

class B extends A
{
    int age = 20;
    public void showAge()
    {
        System.out.println("Class A: " + super.age);    // calling base class variable
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        A obj = new B();
        B obj2 = new B();
        System.out.println(obj.age);
        System.out.println(obj2.age);
        obj2.showAge();
    }
}
