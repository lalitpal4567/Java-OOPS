package inheritance.constructorINheritance.example_02;

// Java program to show the sequence of constructor calling in multilevel inheritence

class Monkey
{
    Monkey()
    {
        System.out.println("calling monkey class constructor...");  // first
    }
}
class Human extends Monkey
{
    Human()
    {
        System.out.println("calling human class constructor...");   // second
    }
}
class Alien extends Human
{
    Alien()
    {
        System.out.println("calling alien class constructor.");    // third
    }
}

public class HumanSpecies
{
    public static void main(String[] args) {
        Alien obj = new Alien ();
    }
}
