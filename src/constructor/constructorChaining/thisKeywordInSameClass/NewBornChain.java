package constructor.constructorChaining.thisKeywordInSameClass;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword

class NewBornChain
{
    NewBornChain()
    {
        this(5);
        System.out.println("The Default constructor");
    }
    NewBornChain(int x)
    {
        this(5, 15);
        System.out.println(x);
    }

    NewBornChain(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        NewBornChain obj = new NewBornChain();
    }
}

