package abstraction.abstractClass;

abstract class Base{
    abstract void fun();
}
class Derived extends Base{
    @Override
    public void fun(){
        System.out.println("having fun...");
    }
}

public class AbstractMethodTest {
    public static void main(String[] args) {
        Derived obj = new Derived();
        Base obj2 = new Derived();
        obj.fun();  // having fun...
        obj2.fun(); // having fun...
    }
}
