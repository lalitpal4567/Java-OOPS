package polymorphism.overloading.methodOverloading.changingDataType;


public class GorillaOverload {
    public void fly(String s){
        System.out.println("string");
    }
    public void fly(Object o){
        System.out.println("object");
    }
    public void fly(Integer i){
        System.out.println("integer");
    }

    public static void main(String[] args) {
        GorillaOverload obj = new GorillaOverload();
        obj.fly("test");
        obj.fly(100);
    }
}
