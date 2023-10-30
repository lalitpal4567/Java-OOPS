package polymorphism.overriding.sameVariableInParentChildClass;

class Query{
    int a = 400;
    int b = 200;
}

public class Children extends Query{
    int a = 1000;
    int b = 2000;
    public void add(int a, int b){
        System.out.println(a + this.b - super.a);
    }

    public static void main(String[] args) {
        Children obj = new Children();
        obj.add(100, 300);
    }
}
