package constructor.parametrizedConstructor;

class Student
{
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class StudentProfile {
    public static void main(String[] args) {
        Student stu1 = new Student("Lalit" , 23, "B.tech (CS)");
        System.out.println("Name: " + stu1.getName());
        System.out.println("Age: " + stu1.getAge());
        System.out.println("Course: " + stu1.getCourse());
    }
}
