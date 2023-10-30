package methodOverloading.orderOfParameters;

public class ParameterOrder4 {
    public static float product(int a, long b, float c) {
        System.out.print("int  long  float      ");
        return a*b*c;
    }
    public static float product(long a, float b, int c) {
        System.out.print("long  float  int    ");
        return a*b*c;
    }
    public static float product(float a, int b, long c) {
        System.out.print("float  int  long      ");
        return a*b*c;
    }
    public static float product(int a, float b, long c) {
        System.out.print("int  float  long    ");
        return a*b*c;
    }
    public static float product(long a, int b, float c) {
        System.out.print("long  int  float      ");
        return a*b*c;
    }
    public static float product(float a, long b, int c) {
        System.out.print("float  long  int    ");
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(product(1, 2L, 3.0F));
        System.out.println(product(1L, 2.0F, 3));
        System.out.println(product(1.0F, 2, 3L));
        System.out.println(product(1, 2.0F, 3L));
        System.out.println(product(1L, 2, 3.0F));
        System.out.println(product(1.0F, 2L, 3));
    }
}
