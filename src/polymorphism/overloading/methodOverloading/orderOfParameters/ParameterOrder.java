package methodOverloading.orderOfParameters;

public class ParameterOrder {
    public static void print(int a, long b) {
        System.out.println("int   long");
    }
    public static void print(long a, int b) {
        System.out.println("long   int");
    }

    public static void main(String[] args) {
        print(2,4L);
        print(5L, 10);
//        print(5, 4);        // compilation error, ambiguity calls both method
    }
}
