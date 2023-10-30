package inheritance.singleInheritance.example_06;

class Parent
{
    void foodType()     // by default it is package
    {
        System.out.println("we are vegetarian.");
    }
    public void eyeColor()
    {
        System.out.println("Eye color: Dark Brown");
    }
    protected void languageAccent()
    {
        System.out.println("Hindi accent");
    }
    private void accountBalance()   // will not be inherited
    {
        System.out.println("Balance: 200000/-");
    }
}
class Child extends Parent
{
    public void eatingFastFood()
    {
        System.out.println("eating fast food...");
    }
}
public class ParentChild {
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.eatingFastFood();
        obj.foodType();
        obj.eyeColor();
        obj.languageAccent();
//        obj.accountBalance();   // private method
    }
}
