package constructor.constructorChaining.thisKeywordInSameClass;


class Reddish
{
    String color;
    boolean isTasty;

    Reddish()
    {
        System.out.println("Reddish is a vegetable.");
    }
    Reddish(String color, boolean isTasty)
    {
        this(); // must be the first statement
        this.color = color;
        this.isTasty = isTasty;
    }
    void showReddishInfo()
    {
        System.out.println("Reddish color is "+color+" and is tasty: "+isTasty);
    }
}
public class ConstructorChain02 {
    public static void main(String[] args)
    {
        Reddish obj = new Reddish("Orange", true);
        obj.showReddishInfo();
    }
}
