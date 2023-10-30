package abstraction.interfaces.implementingInterfacesOverridingInterfaceMethod;

interface Greeting {
    default void hello() {
        System.out.println("hello from Greeting interface");
    }
}
interface Welcome extends Greeting {
    @Override
    default void hello() {
        System.out.println("hello from Welcome interface");
    }
}

public class GrandWelcome implements Welcome, Greeting {
    public static void main(String[] args)
    {
        GrandWelcome obj = new GrandWelcome();
        obj.hello();
    }
}
