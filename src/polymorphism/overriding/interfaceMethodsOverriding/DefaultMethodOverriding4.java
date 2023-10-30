package polymorphism.overriding.interfaceMethodsOverriding;


interface AndroidVersion1{
    default void cameraQuality(){
        System.out.println("12 mpx camera.");
    }
    default void versionOne(){
        System.out.println("AndroidVersion1 interface");
    }
}
interface AndroidVersion2 extends AndroidVersion1{
    @Override
    default void cameraQuality(){
        System.out.println("18 mpx camera.");
    }
    default void versionTwo(){
        System.out.println("AndroidVersion2 interface");
    }
}
abstract class AndroidVersion3 implements AndroidVersion2{
//    @Override
//    default void cameraQuality(){
//        System.out.println("25 mpx camera.");
//    }

    @Override
    public void cameraQuality(){
        System.out.println("25 mpx camera.");
    }
    void versionThree(){
        System.out.println("AndroidVersion3 abstract class");
    }
}
class AndroidVersion4 extends AndroidVersion3{
    @Override
    public void cameraQuality(){
        System.out.println("32 mpx camera.");
    }
    void versionFour(){
        System.out.println("AndroidVersion4 class");
    }
}

public class DefaultMethodOverriding4 {
    public static void main(String[] args) {
        AndroidVersion4 versionFour = new AndroidVersion4();
        versionFour.cameraQuality();
        versionFour.versionFour();
        versionFour.versionThree();
        versionFour.versionTwo();
        versionFour.versionOne();


        System.out.println("\n-------------------------------");
        AndroidVersion3 versionThree = new AndroidVersion4();
        versionThree.cameraQuality();
//        versionThree.versionFour(); // compilation error
        versionThree.versionThree();
        versionThree.versionTwo();
        versionThree.versionOne();


        System.out.println("\n-------------------------------");
        AndroidVersion2 versionTwo = new AndroidVersion4();
        versionTwo.cameraQuality();
//        versionTwo.versionFour();   // compilation error
//        versionTwo.versionThree();  // compilation error
        versionTwo.versionTwo();
        versionTwo.versionOne();


        System.out.println("\n-------------------------------");
        AndroidVersion1 versionOne = new AndroidVersion4();
        versionOne.cameraQuality();
//        versionOne.versionFour();   // compilation error
//        versionOne.versionThree();  // compilation error
//        versionOne.versionTwo();    // compilation error
        versionOne.versionOne();
    }
}

