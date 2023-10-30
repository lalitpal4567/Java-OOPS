package constructor.defaultConstructor;

class Addition
{
    int firstNum = 10;
    int secondNum = 20;
    int result;

    Addition()
    {
        result = firstNum + secondNum;
    }
    public void showResult()
    {
        System.out.println("Sum is: " + result);
    }
}
public class Result {
    public static void main(String[] args)
    {
        Addition obj = new Addition();
        obj.showResult();
    }
}
