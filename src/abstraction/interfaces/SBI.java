package abstraction.interfaces;

interface RBI {
    void branchName();                     // public abstract by default
//    public void branchName();            // public abstract by default
//    abstract void branchName();          // public abstract by default
//    public abstract void branchName();   // public abstract by default

//    void branchName(){            // compilation error, Interface abstract methods cannot have body
//        System.out.println("Body");
//    }
//    void branchName(){};        // compilation error, Interface abstract methods cannot have body

//    final void branchName();                   // compilation error, Modifier 'final' not allowed here
//    final void branchName(){                   // compilation error, Modifier 'final' not allowed here
//        System.out.println("BOI");
//    }
//    public static abstract void branchName();  // compilation error, only one of abstract, default or static
//    private abstract void branchName();        // compilation error, Illegal combination of modifiers: 'abstract' and 'private'
//    protected abstract void branchName();      // compilation error, Modifier 'protected' not allowed here
    default void interestRate(){                     // default method
        System.out.println("interest rate is 7%");
    }
    default void interestRate2(){}                  // default method
//    default void interestRate();                    // compilation error, method should have a body

//     default static void netBanking(){  // only one of abstract, default, or static permitted
//         System.out.println("Net banking is available");
//     }

//    default abstract void fdRate();         // compilation error, only one of abstract, default or static
//    default abstract static void fdRate();  // compilation error, only one of abstract, default or static

//    default final void interestRate(){      // compilation error, Modifier 'final' not allowed here
//        System.out.println("interest rate is 5%");
//    }

    static void mobileBanking() {
        System.out.println("mobile banking is available");
    }
    public static void mobileBanking1() {
        System.out.println("mobile banking is available");
    }

//    static final void mobileBanking(){      // compilation error, Modifier 'final' not allowed here
//        System.out.println("mobile banking is available");
//    }

    private void smsBanking() {
        System.out.println("sms banking is available");
    }
    private static void chequeBook() {
        System.out.println("we provide cheque book");
    }

    // protected void debitCard()  // only public, private, abstract, default, static and strictfp are permitted
    // {
    //     System.out.println("debit card facility is available");
    // }
}

public class SBI implements RBI {
    @Override
    public void branchName() {
        System.out.println("This is kondli Delhi branch.");
    }
    public void BankName() {
        System.out.println("This is SBI bank");
    }

    @Override
    public void interestRate(){                     // default method
        System.out.println("interest rate is 9%");
    }
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.branchName();
        obj.interestRate();
        // obj.mobileBanking();  // compilation error, static method can't be inherited in interface
//        SBI.mobileBanking();     // compilation error, Static method may be invoked on containing interface class only
        RBI.mobileBanking();
        obj.BankName();

        RBI obj1 = new SBI();
        obj1.branchName();
        obj1.interestRate();
        // obj1.mobileBanking(); // static method of interface RBI can only be accessed as RBI.mobileBanking
        // obj1.BankName(); // can't be accessed
    }
}
