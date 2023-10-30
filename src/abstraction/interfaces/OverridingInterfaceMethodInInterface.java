package abstraction.interfaces;

interface Android{
    void operatingSystem();     // public abstract by default
    default void displaySize(){
        System.out.println("4.7 to 9.7 cm");
    }
}
interface Tablet extends Android{
    @Override
    default void operatingSystem(){     // public by default
        System.out.println("Android, iOS");
    }
    @Override
    default void displaySize(){
        System.out.println("5-inch, 7-inch, 9-inch");
    }
}

public class OverridingInterfaceMethodInInterface implements Tablet{
    public static void main(String[] args) {
        OverridingInterfaceMethodInInterface obj = new OverridingInterfaceMethodInInterface();
        obj.operatingSystem();
        obj.displaySize();

        System.out.println();
        Tablet obj2 = new OverridingInterfaceMethodInInterface();
        obj2.operatingSystem();
        obj2.displaySize();

        System.out.println();
        Android obj3 = new OverridingInterfaceMethodInInterface();
        obj3.operatingSystem();
        obj3.displaySize();
    }
}
