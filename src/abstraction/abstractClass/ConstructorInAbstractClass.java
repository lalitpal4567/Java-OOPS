package abstraction.abstractClass;

abstract class Base2{
    Base2(){
        System.out.println("Base2 class constructor");
    }
    abstract void fun();
}
class Derived2 extends Base2{
    Derived2(){
//        super();       // optional
        System.out.println("Derived class constructor");
    }
    @Override
    public void fun(){
        System.out.println("having fun...");
    }
}
public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
        obj.fun();
    }
}
