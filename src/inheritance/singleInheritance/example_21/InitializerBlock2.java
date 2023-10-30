package inheritance.singleInheritance.example_21;

class A
{
    String className = "Class A";
}

class B extends A
{
    String className = "Class B";

    {
        System.out.println(super.className);
    }
}

class C extends B
{
    String className = "Class C";

    {
        System.out.println(super.className);
    }
}

public class InitializerBlock2
{
    public static void main(String[] args)
    {
        C obj = new C();

        System.out.println(obj.className);
    }
}
