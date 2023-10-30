package abstraction.interfaces.StaticNonStaticReference;

interface Mall{
    default void mallName(){
        System.out.println("Shipra Mall");
    }
    private void ownerName(){
        System.out.println("Lalit Pal");
        mallName();
    }
    private static void managerName(){
        System.out.println("Sachin Kumar");
//        ownerName();    // compilation error, Non-static method 'ownerName()' cannot be referenced from a static context
    }
    static void totalEarning(){
        System.out.println("Only 10 thousand");
        managerName();
//        ownerName();    // compilation error, Non-static method 'ownerName()' cannot be referenced from a static context
    }
}

public class Shopping implements Mall{
    public static void main(String[] args) {
        Mall.totalEarning();
    }
}
