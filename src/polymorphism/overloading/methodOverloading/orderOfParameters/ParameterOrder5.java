package methodOverloading.orderOfParameters;

public class ParameterOrder5 {
    public void add() {
        System.out.println("no parameters");
    }
    public void add(int a) {
        System.out.println("(int): " + a);
    }
    public void add(long a) {
        System.out.println("(long): " + a);
    }
    public void add(float a) {
        System.out.println("(float): " + a);
    }
    public void add(int a, int b) {
        System.out.println("(int  int): " + a + b);
    }
    public void add(int a, long b) {
        System.out.println("(int  long): " + a + b);
    }
    public void add(int a , float b) {
        System.out.println("(int  float): " + a + b);
    }
    public void add(float a, int b) {
        System.out.println("(float  int): " + a + b);
    }
    public void add(double a, float b) {
        System.out.println("(double  float): " + a + b);
    }
    public void add(float a, double b) {
        System.out.println("(float  double b): " + a + b);
    }
    public void add(long a, double b, float c) {
        System.out.println("(long  double  float): " + a + b + c);
    }
    public void add(double a, long b, float c) {
        System.out.println("(double  long  float): " + a + b + c);
    }
    public void add(long a, float b,double c) {
        System.out.println("(long  float  double): " + a + b + c);
    }

    public static void main(String[] args) {
        ParameterOrder5 obj = new ParameterOrder5();
        obj.add();        // add()
        obj.add(2);      // add(int a)
        obj.add(4L);     // add(long a)
        obj.add(6.6F);   // add(float a)
        obj.add(8,10);       // add(int a, int b)
        obj.add(9,90L);      // add(int a, long b)
        obj.add(8,10.5F);    // add(int a , float b)
        obj.add(12.5F,9);        // add(float a, int b)
        obj.add(14.5,15.5f);     // add(double a, float b)
        obj.add(20.5F,40.50);    //add(float a, double b);
        obj.add(100L,100.50,200.50F);   // add(long a, double b, float c)
        obj.add(500.0,550L,550.50F);    // add(double a, long b, float c)
        obj.add(1000,1000.5F,1000.500); // add(long a, float b,double c)
    }
}
