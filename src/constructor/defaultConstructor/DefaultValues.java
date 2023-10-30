package constructor.defaultConstructor;

// If we don't define explicit default constructor, the compiler creates its
// own default constructor and initializes the instance variables with their
// default values.
class InstanceVar
{
    byte ageInYears;
    short weightInKg;
    int heightInCm;
    long contactNo;
    float marksObtainedInExam;
    double ageInSeconds;
    char gender;
    boolean isMarried;
    String goodName;    // reference type
    int[] foodList = new int[10];

    // Compiler generated default constructor to set initial values to
    // the instance variables.
//    InstanceVar()
//    {
//        this.ageInYears = 0;
//        this.weightInKg = 0;
//        this.heightInCm = 0;
//        this.contactNo = 0;
//        this.marksObtainedInExam = 0.0f;
//        this.ageInSeconds = 0.0;
//        this.gender = '\u0000';
//        this.isMarried = false;
//        this.goodName = null;
//    }


}
public class DefaultValues {
    public static void main(String[] args) {
        InstanceVar obj = new InstanceVar();
        System.out.println("byte: " + obj.ageInYears);
        System.out.println("short: " + obj.weightInKg);
        System.out.println("int: " + obj.heightInCm);
        System.out.println("long: " + obj.contactNo);
        System.out.println("float: " + obj.marksObtainedInExam);
        System.out.println("double: " + obj.ageInSeconds);
        System.out.println("char: "+ obj.gender);   // \u0000 ( null character)
        System.out.println("boolean: " + obj.isMarried);
        System.out.println("String: " + obj.goodName);  // null
        System.out.println("Array: " + obj.foodList);   // null
    }
}
