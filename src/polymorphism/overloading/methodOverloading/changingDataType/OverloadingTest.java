package polymorphism.overloading.methodOverloading.changingDataType;

public class OverloadingTest {
    public static void show(int a) {
        System.out.println("int");
    }
    public static void show(long a) {
        System.out.println("long");
    }
    public static void show(double a) {
        System.out.println("double");
    }
    public static void show(float a) {
        System.out.println("float");
    }

    public static void main(String[] args) {
        show(1);
        show(2L);
        show(1.15);
        show(1.0F);
    }
}
