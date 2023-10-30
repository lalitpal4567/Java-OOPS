package inheritance.singleInheritance.example_15;

class Account
{
    // these private instance variables can also be made final
    private String branchName = "SBI Phase-III";
    private String IfscCode = "SBI00021";
    private long accountNo = 23004127000L;  // L / l to specify the type
    public String emailID = "lalit2222@gmail.com";
    public String username = "lalit2000";
    public String password = "Sbi@123";

    public String getBranchName()
    {
        return branchName;
    }
    public String getIfscCode()
    {
        return IfscCode;
    }
    public long getAccountNo()
    {
        return accountNo;
    }
    public String getEmailID()
    {
        return emailID;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
}
class AccountHolder extends Account{
    public void changeEmailId(String newEmailId)
    {
        this.emailID = newEmailId;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        AccountHolder obj = new AccountHolder();
        System.out.println(obj.getBranchName());
        System.out.println(obj.getIfscCode());
        System.out.println(obj.getAccountNo());
        System.out.println(obj.getEmailID());
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.changeEmailId("lalit1111@gmail.com");
        System.out.println("\nAfter changing email id");
        System.out.println(obj.getEmailID());
    }
}
