package designPattern.singletonPattern;

// Eager initialization
class EagerSingleton{
    private static EagerSingleton obj = new EagerSingleton();
    private EagerSingleton(){};
    public static EagerSingleton getInstance(){
        return obj;
    }
}
public class EagerSingletonDriver {
    public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();

        System.out.println(obj1.hashCode() == obj2.hashCode());
    }
}
