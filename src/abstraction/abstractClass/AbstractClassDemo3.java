package abstraction.abstractClass;

abstract class Base3{
    void fun(){
        System.out.println("fun() in Base3 class");
    }
}
class Derived3 extends Base3{
    @Override
    void fun(){
        System.out.println("fun() in Derived3 class");
    }
}

public class AbstractClassDemo3 {
    public static void main(String[] args) {
        Derived3 obj = new Derived3();
        Base3 obj2 = new Derived3();
        obj.fun();  // fun() in Derived3 class
        obj.fun();  // fun() in Derived3 class
    }
}
