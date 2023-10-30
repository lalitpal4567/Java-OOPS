package polymorphism.overloading.methodOverloading;

class ShowCase
{
    public static void show(int a)
    {
        System.out.println("static method in showcase class");
    }
    public void show(float a)
    {
        System.out.println("non static method in showcase class");
    }
}

public class ShowCaseTest extends ShowCase
{
    public void show(long a)    // overloading of parent class methods
    {
        System.out.println("method in showcasetest class");
    }

    public static void main(String[] args) {
        ShowCaseTest obj = new ShowCaseTest();
        ShowCaseTest.show(1);
        obj.show(2.5F);
        obj.show(3L);
    }
}