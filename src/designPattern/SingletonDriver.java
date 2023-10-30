package designPattern;

// Singleton class is a class of which single instance can be created.
// If we try to create further instances, it returns the same object
// This is Lazy initialization
class LazySingleton {
    private static LazySingleton obj;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(obj == null)
            obj = new LazySingleton();
        return obj;
    }
}

public class SingletonDriver {
    public static void main(String[] args) {
        LazySingleton newObj = LazySingleton.getInstance();
        LazySingleton newObj2 = LazySingleton.getInstance();

        System.out.println(newObj.hashCode() == newObj2.hashCode());
    }
}
