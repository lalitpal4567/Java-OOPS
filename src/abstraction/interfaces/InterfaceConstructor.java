package abstraction.interfaces;

// constructors are not allowed in interface
interface ConstructorInterface {
//    ConstructorInterface() {        // compilation error
//        System.out.println("This is default constructor");
//    }
}

public class InterfaceConstructor implements ConstructorInterface {
    public final static void main(String[] args) {
        InterfaceConstructor obj = new InterfaceConstructor();
    }
}
