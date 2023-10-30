package polymorphism.overloading.methodOverloading.changingDataType;

public class MainMethodOverloading {
    public static void main(int a) {
        System.out.println("main method with int parameter");
    }
    public static void main(String str) {
        System.out.println("main method with string parameter");
    }
    public void main(){
        System.out.println("main method without parameters");
    }

    public static void main(String[] args) {    // original main method
        System.out.println("Original main method");
        main(1);
        main("one");

        new MainMethodOverloading().main();
    }
}
