package abstraction.interfaces;

interface First{
    default void show(){
        System.out.println("default method of First interface");
    }
}
interface Second{
    default void show(){
        System.out.println("default method of Second interface");
    }
}
public class SuperKeyword implements First, Second{
    @Override
    public void show(){
        First.super.show();
        Second.super.show();
    }
    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
        obj.show();
    }
}
