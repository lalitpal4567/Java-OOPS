package abstraction.interfaces;

interface Pond{
    void waterFlow();
    default void purifyingWater(){
        System.out.println("water is not purified");
    }
}
interface River extends Pond{
    void fishing();
}
interface Sea extends River{
    @Override
    default void waterFlow(){
        System.out.println("water does not flow.");
    }
    @Override
    default void purifyingWater(){
        System.out.println("water is purified but too salty.");
    }
}

public class OverridingInterfaceMethodInInterface2 implements Sea{
    @Override
    public void fishing(){
        System.out.println("fishing in sea can make you rich.");
    }

    public static void main(String[] args) {
        OverridingInterfaceMethodInInterface2 obj = new OverridingInterfaceMethodInInterface2();
        obj.waterFlow();
        obj.purifyingWater();
        obj.fishing();

        System.out.println();
        Sea obj2 = new OverridingInterfaceMethodInInterface2();
        obj2.waterFlow();
        obj2.purifyingWater();
        obj2.fishing();

        System.out.println();
        River obj3 = new OverridingInterfaceMethodInInterface2();
        obj3.waterFlow();
        obj3.purifyingWater();
        obj3.fishing();

        System.out.println();
        Pond obj4 = new OverridingInterfaceMethodInInterface2();
        obj4.waterFlow();
        obj4.purifyingWater();
    }
}
