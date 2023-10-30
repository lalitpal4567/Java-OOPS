package inheritance.singleInheritance.example_13;

class Animal
{
    byte noOfLegs = 4;    // instance variable
    void numberOfLegs()     // instance method
    {
        System.out.println("We have "+noOfLegs+" legs.");
    }
}
class Dog extends Animal
{
    String name = "Bolt";
    void eat()
    {
        System.out.println("I eat pedigree and biscuits.");
    }
}

public class DogTest {

    public static void main(String[] args)
    {
        Dog labrador = new Dog();
        labrador.numberOfLegs();
        labrador.eat();
        System.out.println(labrador.name+" has "+labrador.noOfLegs+" legs.");
    }
}
