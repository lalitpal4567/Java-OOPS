package constructor.parametrizedConstructor;

public class StudentData
{
    String name;
    String gender;
    short age;
    long contactNo;

    StudentData(String name, String gender, short age, long contactNo)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contactNo = contactNo;
    }
    public void showStudentInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Contact no.: " + contactNo);
    }

    public static void main(String[] args)
    {
        StudentData stu = new StudentData("Raj", "Male", (short)22, 9858785264L);
        stu.showStudentInfo();
    }
}
