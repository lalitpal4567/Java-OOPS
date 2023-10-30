package inheritance.singleInheritance.staticMethod;


class College
{
    public static void displayCollegeName()
    {
        System.out.println("Noida Institute Of Technology.");
    }
}
public class Student extends College {
    public void fillingForm()
    {
        System.out.println("filling admission form...");
    }
    public static void main(String[] args) {
        Student stu = new Student();
//        stu.displayCollegeName();   // static methods should be accessed by class name
                                    // not object
        Student.displayCollegeName();   // using class name
        stu.fillingForm();
        College.displayCollegeName();   // using class name
    }
}
