package designPattern.singletonPattern;

class MySingleton {
    private static class MyWrapper {
        static MySingleton INSTANCE = new MySingleton();
    }
    private MySingleton () {}

    public static MySingleton getInstance() {
        return MyWrapper.INSTANCE;
    }
}

public class ThreadSafeSingleton{
    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getInstance();
        MySingleton obj2 = MySingleton.getInstance();

        System.out.println(obj1.hashCode() == obj1.hashCode());
    }
}