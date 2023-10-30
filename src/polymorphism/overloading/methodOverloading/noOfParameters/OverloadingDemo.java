package methodOverloading.noOfParameters;

public class OverloadingDemo {
    public static void show() {
        System.out.println("no parameter");
    }
    public static void show(int a){
        System.out.println("int: " + a);
    }
    public static void show(int a, int b) {
        System.out.println("int  int:  " + a + "  " + b);
    }

//    public void show(int a){  // we can't overload method differ by only static keyword
//        System.out.println("int: " + a);
//    }

    public static void main(String[] args) {
        OverloadingDemo.show();
        OverloadingDemo.show(2);
        OverloadingDemo.show(1, 2);

        OverloadingDemo obj = new OverloadingDemo();
        obj.show(5);
    }
}
