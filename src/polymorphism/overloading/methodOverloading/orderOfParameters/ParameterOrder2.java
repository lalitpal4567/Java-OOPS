package methodOverloading.orderOfParameters;

public class ParameterOrder2 {
    public static void method(float a, long b) {
        System.out.println("float  long");
    }
    public static void method(long a, float b) {
        System.out.println("long   float");
    }

    public static void main(String[] args) {
        method(5.5F,10);  // promotion from int to long
        method(15,20.0F);  // promotion from int to long
//        method(5, 5);   // ambiguity
    }
}
