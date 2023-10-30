package inheritance.singleInheritance.example_02;


class KeypadPhone
{
    void message()  // by default package
    {
        System.out.println("Sending message....");
    }
    public void makeCalls()
    {
        System.out.println("Making phone calls...");
    }
}
class SmartPhone extends KeypadPhone
{
    public void takingPics()
    {
        System.out.println("taking photos...");
    }
}
public class Mobile {
    public static void main(String[] args)
    {
        SmartPhone obj = new SmartPhone();
        obj.message();
        obj.makeCalls();
        obj.takingPics();
    }
}
