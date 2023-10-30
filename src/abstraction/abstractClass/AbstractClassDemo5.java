package abstraction.abstractClass;

abstract class Base5{
    void fun(){
        System.out.println("having fun...");
    }
}
class Derived5 extends Base5{
    Derived5(){
        System.out.println("constructor in Derived5 class");
    }
    @Override
    public void fun(){
        super.fun();
        System.out.println("fun() in Derived5 class");
    }
}
public class AbstractClassDemo5 {
    public static void main(String[] args) {
        Derived5 obj = new Derived5();
        obj.fun();
    }
}
