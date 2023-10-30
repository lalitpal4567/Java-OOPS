package inheritance.singleInheritance.example_14;

class Vault
{
    private int passcode = 6543;
    public void showPasscode()
    {
        System.out.println("Passcode: "+passcode);
    }
}
public class Accessor extends Vault
{
    public static void main(String[] args) {
        Accessor obj = new Accessor();
//         System.out.println("Passcode: "+obj.passcode); // The field passcode is not visible
        obj.showPasscode();
    }
}
