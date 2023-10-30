package polymorphism.overriding.interfaceMethodsOverriding;

interface MyInterface{
    int num = 10;   // public static final
    default void display(){     // by default it is public
        System.out.println("method in interface class");
    }
}
public class InterfaceExample implements MyInterface {
//    @Override
//    default void display(){       // compilation error
//        System.out.println("method in interfaceExample.");
//    }
//    @Override
//     void display(){    // compilation error, by default it is package private ( we can't reduce the visibility )
//        System.out.println("method in interfaceExample.");
//    }

    @Override
    public void display(){
        System.out.println("method in InterfaceExample");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.display();
        System.out.println(InterfaceExample.num);
    }
}
