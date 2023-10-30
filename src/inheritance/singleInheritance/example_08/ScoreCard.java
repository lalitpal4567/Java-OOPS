package inheritance.singleInheritance.example_08;

// Protected, private and public are access modifiers
// Except private all are visible in subclass within same package
class Score
{
    int maxMarks = 100;    // by default it is package
    static String examName = "NPTEL";   // by default it is package
    public String status = "pass";
    protected float obtainedMarks = 40;
    private byte percentage = 40;
}

public class ScoreCard extends Score
{
    public static void main(String[] args) {
        ScoreCard obj = new ScoreCard();

        System.out.println("Exam name: "+ScoreCard.examName);

        // this keyword is not allowed inside static method
        // this cannot be referenced from a static context
//        System.out.println("Exam name: "+this.examName);    // error

        // static members (class variables and class methods) in the same class
        // can be accessed without classname as well.
        System.out.println("Exam name: "+examName);

        System.out.println("Maximum marks: "+obj.maxMarks);
        System.out.println("Obtained marks: "+obj.obtainedMarks);
        // System.out.println("Percentage: "+obj.percentage);  // not visible
        System.out.println("Status: "+obj.status);
    }
}
