package methodOverloading.orderOfParameters;

public class ParameterOrder3 {
    public static double add(double a, int b) {
        return a+b;
    }
    public static double add(int a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("double  int: "+add(2.5,2));
        System.out.println("int  double: "+add(4,4.5));
//        add(10, 20);    // ambiguity
    }
}
