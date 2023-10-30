package constructor.constructorChaining.thisKeywordInSameClass;


public class NewBornChain02
{
    NewBornChain02()
    {
        System.out.println("default");
    }
    NewBornChain02(int x)
    {
        this();
        System.out.println(x);
    }
    NewBornChain02(int x, int y)
    {
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        new NewBornChain02(8, 10);
    }
}

