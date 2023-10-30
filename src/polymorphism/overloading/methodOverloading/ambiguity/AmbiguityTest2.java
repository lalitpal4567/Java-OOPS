package methodOverloading.ambiguity;

public class AmbiguityTest2 {
    public void mul(int a, long b) {
        System.out.println(a*b);
    }
    public void mul(long a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        AmbiguityTest2 obj = new AmbiguityTest2();
//        obj.mul(2, 5);  // ambiguity
    }
}
