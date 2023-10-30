package inheritance.singleInheritance.example_24;

class Animal
{
    public void move()
    {
        System.out.println("moving...");
    }
}
class Cheetah extends Animal
{
    @Override
    public void move() {
        System.out.println("fastest running animal.");
    }
}
public class FastRunner {
    public static void main(String[] args)
    {
        Animal obj = new Cheetah();
        Cheetah obj2 = new Cheetah();
        obj.move();
        obj2.move();

    }
}
