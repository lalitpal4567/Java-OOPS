package inheritance.singleInheritance.example_04;


// Single inheritance implementation
class Cat
{
    private void meow()
    {
        System.out.println("Cats meow....");
    }
    public void eat()
    {
        System.out.println("Cats eat fish and flesh.");
    }
}
class Lion extends Cat
{
    public void roar()
    {
        System.out.println("Lions roar :)");
    }
}
public class WildAnimal
{
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.eat();
        obj.roar();
//        obj.meow(); // can't be accessed as it is private
    }
}
