package constructor.defaultConstructor;

// Default constructor is also used to initialize the final instance variables.
// It is compulsory to initialize the final instance variables either by initializing
// at the time of declaration or by using default constructor.

public class FinalVar {
    final int totalLogicalProcessor;

    FinalVar()
    {
        totalLogicalProcessor = 16;
    }

    public static void main(String[] args) {
        System.out.println("Total logical processors: " + new FinalVar().totalLogicalProcessor);
    }
}
