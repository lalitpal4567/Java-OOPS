package inheritance.singleInheritance.staticMethod_02;

class Device
{
    public static void batteryBackup()
    {
        System.out.println("It has inbuilt battery.");
    }
}
class Mobile extends Device
{
    public static void processorTask()
    {
        System.out.println("It has processor inside it.");
    }
}
public class SmartPhone {
    public static void main(String[] args)
    {
        // accessing static methods using class name
        Device.batteryBackup();
        Mobile.processorTask();
        Mobile.batteryBackup();
    }
}
