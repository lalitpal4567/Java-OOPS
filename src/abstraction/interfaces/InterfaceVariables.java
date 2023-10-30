package abstraction.interfaces;

interface InterfaceCon2 {
    int a= 1;           // public static final
    static int b = 2;   // public static final
    final int c = 3;    // public static final
    static final int d = 4; // public static final
    public static final int e = 5;  // public static final
    public int f = 6;  // public static final

    // private int g = 6;  // error Only public, static and final are permitted
    // protected int h = 7; // error Only public, static and final are permitted
    // default int g = 6;  // error Only public, static and final are permitted

    default void change()
    {
        // a = 3;   // can't be changed
        // b = 6;   // can't be changed
        // c = 5;   // can't be changed
        // e = 9;   // can't be changed
        // f = 7;
    }
}

public class InterfaceVariables implements InterfaceCon2 {
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        System.out.println(InterfaceCon.a);
        System.out.println(InterfaceCon.b);
        System.out.println(InterfaceCon.c);
        System.out.println(InterfaceCon.d);
        System.out.println(InterfaceCon.e);
        System.out.println(InterfaceCon.f);

        // obj.change();
    }
}

