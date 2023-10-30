package inheritance.singleInheritance.example_17;

class Mammal
{
    String bloodType;
    String reproduceMethod;
    Mammal()
    {
        System.out.println("Mammal Class Constructor");
        bloodType = "Warm";
        reproduceMethod = "Birth";
    }
    void showMammalProperty()
    {
        System.out.println("\nMammal's Property");
        System.out.println("Blood Type: "+bloodType);
        System.out.println("Reproduce Method: "+reproduceMethod);
    }
}
class Cat extends Mammal
{
    int legs;
    float height;
    Cat()
    {
        System.out.println("Cat Class Constructor");
        legs = 4;
        height = 1.5f;
    }
    void showCatProperty()
    {
        System.out.println("\nCat's property");
        System.out.println("Legs: "+legs);
        System.out.println("Height: "+height);
    }
}

public class Creature
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.showMammalProperty();
        cat.showCatProperty();
    }
}
