package inheritance.singleInheritance.example_20;

class A
{
    {
        System.out.println(1);
    }
}

class B extends A
{
    {
        System.out.println(2);
    }
}

class C extends B
{
    {
        System.out.println(3);
    }
}

public class InitializerBlock
{
    public static void main(String[] args)
    {
        System.out.println("hi there");
        C obj = new C();
    }
}
