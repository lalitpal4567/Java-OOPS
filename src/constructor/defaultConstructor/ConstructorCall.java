package constructor.defaultConstructor;

// Java program to show that constructor is called automatically when object is created.

class Construction
{
    Construction()
    {
        System.out.println("This is base class constructor.");  // will be called automatically
    }
}

public class ConstructorCall
{
    ConstructorCall()
    {
        System.out.println("main method constructor.");
    }
    public static void main(String[] args)
    {
        Construction obj = new Construction();
        ConstructorCall obj2 = new ConstructorCall();
    }
}
