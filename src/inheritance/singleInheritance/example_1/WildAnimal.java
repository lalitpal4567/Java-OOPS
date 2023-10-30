package inheritance.singleInheritance.example_1;

// Single inheritance implementation
class Cat
{
    public void eat()
    {
        System.out.println("Cats eat fish and flesh.");
    }
}
class Lion extends Cat
{
    public void voice()
    {
        System.out.println("Lions roar :)");
    }
}
public class WildAnimal
{
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.eat();
        obj.voice();
    }
}

