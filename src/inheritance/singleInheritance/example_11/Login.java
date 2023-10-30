package inheritance.singleInheritance.example_11;

class Password
{
    private void password()
    {
        System.out.println("1234567");
    }
}

public class Login extends Password
{
    public void username()
    {
        System.out.println("Raj65");
    }
    public static void main(String[] args)
    {
        Password obj = new Password();
//         obj.password();	// The method username() from the type Password is not visible

        Login obj1 = new Login();
        obj1.username();
//        obj1.password();    // private method  of Password class.
    }
}