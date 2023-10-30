package abstraction.interfaces.interfaceWithSameDefaultMethod;

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
interface Run {
    public default int getSpeed() {
        return 10;
    }
}

public class Cat implements Walk, Run {
    @Override
    public int getSpeed() {
        return 1;
    }
    public int getWalkSpeed() {
        return Walk.super.getSpeed();   // calling method of Walk interface
    }
    public int getRunSpeed(){
        return Run.super.getSpeed();    // calling method of Run interface
    }
    public static void main(String[] args) {
        Cat obj = new Cat();
        System.out.println(obj.getSpeed());     // 1
        System.out.println(obj.getWalkSpeed()); // 5
        System.out.println(obj.getRunSpeed());  // 10

        System.out.println();
        Run obj2 = new Cat();
        System.out.println(obj2.getSpeed());    // 1
//        obj2.getWalkSpeed();    // compilation error
//        obj2.getRunSpeed();     // compilation error

        System.out.println();
        Walk obj3 = new Cat();
        System.out.println(obj3.getSpeed());    // 1
//        obj3.getWalkSpeed();    // compilation error
//        obj3.getRunSpeed();     // compilation error
    }
}

