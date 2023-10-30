package abstraction.interfaces;

interface Dog{
    void eatFlesh();
}
abstract class WildDog implements Dog{
    @Override
    public void eatFlesh(){
        System.out.println("eating flesh...");
    }
}
public class Hyna extends WildDog{
    @Override
    public void eatFlesh(){
        System.out.println("eating leftover flesh...");
    }

    public static void main(String[] args) {
        Hyna obj = new Hyna();
        obj.eatFlesh();

        WildDog obj2 = new Hyna();
        obj2.eatFlesh();

        Dog obj3 = new Hyna();
        obj3.eatFlesh();
    }
}
