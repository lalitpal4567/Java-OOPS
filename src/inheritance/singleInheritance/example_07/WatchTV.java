package inheritance.singleInheritance.example_07;

class Television
{
    public void playSound()
    {
        System.out.println("playing sound...");
    }
    public void displayScreen()
    {
        System.out.println("showing pictures...");
    }
    private void displayColor()
    {
        System.out.println("black and white.");
    }
}
class SmartTV extends Television
{
    public void connectWifi()
    {
        System.out.println("connecting wifi...");
    }
    private void useSmartApps()
    {
        System.out.println("Smart TV has its own apps.");
    }
}
public class WatchTV {
    public static void main(String[] args)
    {
        SmartTV sony = new SmartTV();
        sony.playSound();
        sony.displayScreen();
        sony.connectWifi();
//        sony.useSmartApps();  // private method of SmartTV class, can't be accessed
    }
}
