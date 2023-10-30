package polymorphism.overloading.methodOverloading.changingDataType;

public class Kiwi {
    public void fly(int flyHeight){
        System.out.println("int");
    }
    public void fly(Integer flyHeight){
        System.out.println("Integer");
    }
    public static void main(String[] args) {
        Kiwi obj = new Kiwi();
        obj.fly(3);
    }
}
