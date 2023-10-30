package polymorphism.overriding.interfaceMethodsOverriding;

interface AndroidVersionOne{
    default void cameraQuality(){
        System.out.println("12 mpx camera.");
    }
}
interface AndroidVersionTwo extends AndroidVersionOne{
    @Override
    default void cameraQuality(){
        System.out.println("18 mpx camera.");
    }
}
abstract class AndroidVersionThree implements AndroidVersionTwo{
//    @Override
//    default void cameraQuality(){
//        System.out.println("25 mpx camera.");
//    }

    @Override
    public void cameraQuality(){
        System.out.println("25 mpx camera.");
    }
}
class AndroidVersionFour extends AndroidVersionThree{
    @Override
    public void cameraQuality(){
        System.out.println("32 mpx camera.");
    }
}
public class DefaultMethodOverriding3 {
    public static void main(String[] args) {
        AndroidVersionFour versionFour = new AndroidVersionFour();
        versionFour.cameraQuality();

        AndroidVersionThree versionThree = new AndroidVersionFour();
        versionThree.cameraQuality();

        AndroidVersionTwo versionTwo = new AndroidVersionFour();
        versionTwo.cameraQuality();

        AndroidVersionOne versionOne = new AndroidVersionFour();
        versionOne.cameraQuality();
    }
}
