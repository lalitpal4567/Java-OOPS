package methodOverloading.noOfParameters;

public class MultipleParameters {

    public static int add() {
        return 0+0;
    }
    public static int add(int a) {
        return a+1;
    }
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }
    public static int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        int num1 = add();
        int num2 = add(1);
        int num3 = add(2,2);
        int num4 = add(2,4,6);
        int num5 = add(2,4,6,8);

        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        System.out.println("Num3: "+num3);
        System.out.println("Num4: "+num4);
        System.out.println("Num5: "+num5);
    }
}
