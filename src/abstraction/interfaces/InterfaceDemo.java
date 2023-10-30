package abstraction.interfaces;

interface InterfaceCon
{
    int a = 1;           // public static final
    public int b = 6;  // public static final
    static int c = 2;   // public static final
    final int d = 3;    // public static final
    static final int e = 4; // public static final
    public static final int f = 5;  // public static final

//     private int g = 6;  // error Only public, static and final are permitted
//     protected int h = 7; // error Only public, static and final are permitted
//     default int g = 6;  // error Only public, static and final are permitted

    default void change()
    {
//         a = 3;   // can't be changed
//         b = 6;   // can't be changed
//         c = 5;   // can't be changed
//         e = 9;   // can't be changed
//         f = 7;   // can't be changed
    }
}

public class InterfaceDemo implements InterfaceCon
{
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();

        // using direct access
        System.out.println("--- direct access ---");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // using InterfaceDemo obj
        System.out.println("--- using class obj ---");
        System.out.println(obj.a);
        System.out.println(obj.b);

        // using class name
        System.out.println("--- using class name ---");
        System.out.println(InterfaceDemo.a);
        System.out.println(InterfaceDemo.b);
        System.out.println(InterfaceDemo.c);
        System.out.println(InterfaceDemo.d);
        System.out.println(InterfaceDemo.e);
        System.out.println(InterfaceDemo.f);

        // using interface name
        System.out.println("--- using interface name ---");
        System.out.println(InterfaceCon.a);
        System.out.println(InterfaceCon.b);
        System.out.println(InterfaceCon.c);
        System.out.println(InterfaceCon.d);
        System.out.println(InterfaceCon.e);
        System.out.println(InterfaceCon.f);

        // obj.change();
    }
}

