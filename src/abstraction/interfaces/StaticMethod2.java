package abstraction.interfaces;

interface Windows{
    static void windowsType(){
        System.out.println("Windows-7");
    }
}
interface PersonalComputer extends Windows{
//    @Override   // static method can't be overridden
//    static void windowType(){
//        System.out.println("Windows-8");
//    }
    public static void pcManufacturer(){
        System.out.println("Dell");
    }
}
class Computer implements PersonalComputer{
    static void className(){
        System.out.println("Computer");
    }
}
public class StaticMethod2 {
    public static void main(String[] args) {
        Computer.className();
//        Computer.pcManufacturer();  // compilation error
//        Computer.windowsType();     // compilation error

        PersonalComputer.pcManufacturer();
//        PersonalComputer.windowsType();     // compilation error

        Windows.windowsType();
    }
}
